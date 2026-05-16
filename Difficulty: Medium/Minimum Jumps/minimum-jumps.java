class Solution {
    static int minJumps(int[] arr) {
        
        int n = arr.length;
        
        // If first element is 0, cannot move
        if (arr[0] == 0) {
            return -1;
        }
        
        // If array has only one element
        if (n == 1) {
            return 0;
        }
        
        int jumps = 1;
        int maxReach = arr[0];
        int steps = arr[0];
        
        for (int i = 1; i < n; i++) {
            
            // Reached last index
            if (i == n - 1) {
                return jumps;
            }
            
            // Update maximum reachable index
            maxReach = Math.max(maxReach, i + arr[i]);
            
            // Use one step
            steps--;
            
            // If no steps left
            if (steps == 0) {
                
                jumps++;
                
                // Cannot move further
                if (i >= maxReach) {
                    return -1;
                }
                
                // Reinitialize steps
                steps = maxReach - i;
            }
        }
        
        return -1;
    }
}