import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> factorial(int n) {
        
        ArrayList<Integer> result = new ArrayList<>();
        
        // Initialize with 1
        result.add(1);
        
        for (int x = 2; x <= n; x++) {
            multiply(x, result);
        }
        
        return result;
    }
    
    // Function to multiply current number with result
    private void multiply(int x, ArrayList<Integer> result) {
        
        int carry = 0;
        
        for (int i = result.size() - 1; i >= 0; i--) {
            
            int product = result.get(i) * x + carry;
            
            result.set(i, product % 10);
            carry = product / 10;
        }
        
        // Store remaining carry
        while (carry > 0) {
            result.add(0, carry % 10);
            carry /= 10;
        }
    }
}