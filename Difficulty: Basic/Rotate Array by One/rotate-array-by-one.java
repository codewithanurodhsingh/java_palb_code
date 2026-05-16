class Solution {
    public void rotate(int[] arr) {
        
        int n = arr.length;
        
        // Store last element
        int last = arr[n - 1];
        
        // Shift elements to the right
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        
        // Put last element at first position
        arr[0] = last;
    }
}