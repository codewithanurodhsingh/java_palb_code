import java.util.Arrays;

class Solution {
    public void mergeArrays(int a[], int b[]) {
        
        int n = a.length;
        int m = b.length;
        
        int i = n - 1;
        int j = 0;
        
        // Swap elements if needed
        while (i >= 0 && j < m) {
            
            if (a[i] > b[j]) {
                
                int temp = a[i];
                a[i] = b[j];
                b[j] = temp;
                
                i--;
                j++;
            } else {
                break;
            }
        }
        
        // Sort both arrays
        Arrays.sort(a);
        Arrays.sort(b);
    }
}