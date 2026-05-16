class Solution {
    public int minSwap(int[] arr, int k) {
        
        int n = arr.length;
        
        // Count elements <= k
        int good = 0;
        
        for (int num : arr) {
            if (num <= k) {
                good++;
            }
        }
        
        // Count bad elements in first window
        int bad = 0;
        
        for (int i = 0; i < good; i++) {
            if (arr[i] > k) {
                bad++;
            }
        }
        
        int minSwaps = bad;
        
        int left = 0;
        int right = good;
        
        // Sliding window
        while (right < n) {
            
            // Remove left element
            if (arr[left] > k) {
                bad--;
            }
            
            // Add right element
            if (arr[right] > k) {
                bad++;
            }
            
            minSwaps = Math.min(minSwaps, bad);
            
            left++;
            right++;
        }
        
        return minSwaps;
    }
}