package com.basics;

public class WordSearch {
	
	public static int countCAT(char[][] grid) {
        int count = 0;
        int n = 5;
        
        String target = "CAT";
        
        // Checking horizontal (left to right)
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= n - 3; col++) {
            	
            	
            	
                if (grid[row][col] == 'C' && 
                    grid[row][col + 1] == 'A' && 
                    grid[row][col + 2] == 'T') {
                    count++;
                }
            }
        }
        
        // Check horizontal (right to left)
        for (int row = 0; row < n; row++) {
            for (int col = n - 1; col >= 2; col--) {
                if (grid[row][col] == 'C' && 
                    grid[row][col - 1] == 'A' && 
                    grid[row][col - 2] == 'T') {
                    count++;
                }
            }
        }
        
        // Check vertical (top to bottom)
        for (int col = 0; col < n; col++) {
            for (int row = 0; row <= n - 3; row++) {
                if (grid[row][col] == 'C' && 
                    grid[row + 1][col] == 'A' && 
                    grid[row + 2][col] == 'T') {
                    count++;
                }
            }
        }
        
        // Check vertical (bottom to top)
        for (int col = 0; col < n; col++) {
            for (int row = n - 1; row >= 2; row--) {
                if (grid[row][col] == 'C' && 
                    grid[row - 1][col] == 'A' && 
                    grid[row - 2][col] == 'T') {
                    count++;
                }
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        // Example 5x5 grid (adjust based on actual input)
        char[][] grid = {
            {'C', 'A', 'T', 'X', 'Y'},  // Row 1: contains CAT
            {'A', 'B', 'C', 'D', 'E'},
            {'T', 'A', 'C', 'A', 'T'},
            {'C', 'C', 'A', 'T', 'X'},
            {'X', 'Y', 'C', 'A', 'T'}   // Row 5: contains CAT
        };
        
        int result = countCAT(grid);
        System.out.println("Total occurrences of 'CAT': " + result);
        // According to interviewer: should output 3
    }


}
