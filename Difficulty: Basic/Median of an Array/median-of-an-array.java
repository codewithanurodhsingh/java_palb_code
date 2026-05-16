import java.util.Arrays;

class Solution {
    public double findMedian(int[] arr) {
        
        // Sort the array
        Arrays.sort(arr);
        
        int n = arr.length;
        
        // Odd number of elements
        if (n % 2 == 1) {
            return arr[n / 2];
        }
        
        // Even number of elements
        return (arr[n / 2] + arr[(n / 2) - 1]) / 2.0;
    }
}
