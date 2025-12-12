package com.basics;

import java.util.stream.IntStream;

public class FindCATStreams {
	
	public static int countCAT(char[][] grid) {
        final int n = grid.length;
        final String target = "CAT"; // length = 3
        final int L = target.length();

        // Horizontal left -> right
        long hLR = IntStream.range(0, n) // rows 0..n-1
            .mapToLong(row ->
                IntStream.range(0, n - L + 1) // start cols 0..n-3
                    .filter(col ->
                        grid[row][col] == 'C' &&
                        grid[row][col + 1] == 'A' &&
                        grid[row][col + 2] == 'T')
                    .count()
            )
            .sum();

        // Horizontal right -> left
        long hRL = IntStream.range(0, n) // rows
            .mapToLong(row ->
                {
					return // iterate from n-1 down to 2 inclusive
					IntStream.range(L - 1, n)
				    .map(col -> (n - 1) - (col - (L - 1)))
				    .filter(col ->
				        grid[row][col] == 'C' &&
				        grid[row][col - 1] == 'A' &&
				        grid[row][col - 2] == 'T')
				    .count();
				}
            )
            .sum();

        // Vertical top -> bottom
        long vTB = IntStream.range(0, n) // cols 0..n-1
            .mapToLong(col ->
                IntStream.range(0, n - L + 1) // start rows 0..n-3
                    .filter(row ->
                        grid[row][col] == 'C' &&
                        grid[row + 1][col] == 'A' &&
                        grid[row + 2][col] == 'T')
                    .count()
            )
            .sum();

        // Vertical bottom -> top
        long vBT = IntStream.range(0, n) // cols
            .mapToLong(col ->
            IntStream.iterate(n - 1, i -> i - 1)
            .limit(n - (L - 1))               // same math as horizontal reverse
            .filter(row ->
                grid[row][col] == 'C' &&
                grid[row - 1][col] == 'A' &&
                grid[row - 2][col] == 'T')
            .count()
            )
            .sum();

        long total = hLR + hRL + vTB + vBT;
        return (int) total; // safe for small grids; otherwise return long
    }

    public static void main(String[] args) {
        char[][] grid = {
            {'C', 'A', 'T', 'X', 'Y'},
            {'A', 'B', 'C', 'D', 'E'},
            {'T', 'A', 'C', 'A', 'T'},
            {'C', 'C', 'A', 'T', 'X'},
            {'X', 'Y', 'C', 'A', 'T'}
        };

        int result = countCAT(grid);
        System.out.println("Total occurrences of 'CAT': " + result);
        // According to interviewer: should output 3 for their example grid
    }


}
