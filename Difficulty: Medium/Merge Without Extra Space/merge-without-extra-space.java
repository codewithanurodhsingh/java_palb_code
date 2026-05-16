import java.util.Arrays;

class Solution {
    public void mergeArrays(int a[], int b[]) {
        
        int n = a.length;
        int m = b.length;
        
        int left = n - 1;
        int right = 0;
        
        // Swap elements if needed
        while (left >= 0 && right < m) {
            
            if (a[left] > b[right]) {
                
                int temp = a[left];
                a[left] = b[right];
                b[right] = temp;
                
                left--;
                right++;
            } 
            else {
                break;
            }
        }
        
        // Sort both arrays
        Arrays.sort(a);
        Arrays.sort(b);
    }
}