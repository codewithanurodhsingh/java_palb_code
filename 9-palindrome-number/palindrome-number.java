class Solution {
    public boolean isPalindrome(int x) {
        long reverse = 0;
        int num = x;
        int sign = 1;
        if (x < 0) {
            sign = -1;
            x = -x;
        }
        while (num > 0) {

            int lastdigit = num % 10;
            reverse = (10 * reverse) + lastdigit;
            num = num / 10;
        }
        reverse = sign * reverse;
        int revn = (int)reverse;
        if (revn != x)
            return false;
        else
            return true;

    }
}