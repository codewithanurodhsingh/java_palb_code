class Solution {
    int maxSubarraySum(int[] arr) {
        
        int maxSum = arr[0];
        int currentSum = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            
            // Either start new subarray or continue existing one
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            
            // Update maximum sum found so far
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }
}