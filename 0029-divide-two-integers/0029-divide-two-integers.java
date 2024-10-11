class Solution {
    public int divide(int dividend, int divisor) {
        // Handle edge case where result exceeds 32-bit integer range
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        
        // Check if the result should be positive or negative
        boolean sign = (dividend < 0) == (divisor < 0);
        
        // Use long to handle overflow cases
        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);
        int ans = 0;
        
        // Perform the division using bit manipulation
        while (n >= d) {
            int cnt = 0;
            while (n >= (d << (cnt + 1))) {
                cnt++;
            }
            ans += (1 << cnt);
            n -= (d << cnt);
        }
        
        return sign ? ans : -ans;
    }
}
