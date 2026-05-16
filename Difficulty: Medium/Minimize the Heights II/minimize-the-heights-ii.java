import java.util.Arrays;

class Solution {
    int getMinDiff(int[] arr, int k) {
        
        int n = arr.length;
        
        // Sort the array
        Arrays.sort(arr);
        
        // Initial difference
        int ans = arr[n - 1] - arr[0];
        
        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;
        
        for (int i = 0; i < n - 1; i++) {
            
            int min = Math.min(smallest, arr[i + 1] - k);
            int max = Math.max(largest, arr[i] + k);
            
            // Ignore negative heights
            if (min < 0) {
                continue;
            }
            
            ans = Math.min(ans, max - min);
        }
        
        return ans;
    }
}