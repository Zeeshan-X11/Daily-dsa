class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int N = n * n;
        
        long expectedSum = (long) N * (N + 1) / 2;
        long expectedSquareSum = (long) N * (N + 1) * (2 * N + 1) / 6;
        
        long actualSum = 0;
        long actualSquareSum = 0;
        
        for (int[] row : grid) {
            for (int num : row) {
                actualSum += num;
                actualSquareSum += (long) num * num;
            }
        }
        
        long diff = actualSum - expectedSum; // a - b
        long squareDiff = actualSquareSum - expectedSquareSum; // a^2 - b^2
        
        long sumAB = squareDiff / diff; // a + b
        
        int a = (int)((diff + sumAB) / 2); // repeated
        int b = (int)(a - diff);           // missing
        
        return new int[]{a, b};
    }
}