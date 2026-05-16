import java.util.Arrays;

class Solution {
    public int findMinDiff(int[] arr, int m) {
        
        int n = arr.length;
        
        // Sort the array
        Arrays.sort(arr);
        
        int minDiff = Integer.MAX_VALUE;
        
        // Check every window of size m
        for (int i = 0; i + m - 1 < n; i++) {
            
            int diff = arr[i + m - 1] - arr[i];
            
            minDiff = Math.min(minDiff, diff);
        }
        
        return minDiff;
    }
}