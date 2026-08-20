class Solution {
    public int reverse(int x) {
        long reverse = 0;
        int sign = 1;
        if(x<0){
            sign = -1;
            x = -x;
        }
        while(x>0){
            int lastdigit = x%10;
            reverse = (10 * reverse) + lastdigit;
            x = x/10; 
        }
        if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
            return 0;
        }
        reverse = sign*reverse;
        return (int)reverse;
     }
}