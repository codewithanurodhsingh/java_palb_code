class Solution {
    public int smallestSubWithSum(int x, int[] arr) {
        
        int n = arr.length;
        
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;
        
        for (int end = 0; end < n; end++) {
            
            // Add current element
            sum += arr[end];
            
            // Shrink window while sum > x
            while (sum > x) {
                
                minLength = Math.min(minLength, end - start + 1);
                
                sum -= arr[start];
                start++;
            }
        }
        
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }
}