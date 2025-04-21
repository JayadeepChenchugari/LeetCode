class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long sum = 0, maxi = 0, mini = 0;
        
        for (int x : differences) {
            sum += x;
            maxi = Math.max(maxi, sum); // max of prefix sums
            mini = Math.min(mini, sum); // min of prefix sums
        }
        
        // Range of valid starting values x
        long validCount = upper - lower - maxi + mini + 1;

        return (int)Math.max(0, validCount); // if range is invalid, return 0
    }
}
