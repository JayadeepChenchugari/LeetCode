import java.util.Arrays;

class Solution {
    public int minimumSize(int[] nums, int maxOps) {
        // Sort the array and get the maximum value
        Arrays.sort(nums);
        int high = nums[nums.length - 1]; // Last element after sorting is the maximum
        int low = 1;

        while (low < high) {
            int mid = (low + high) / 2;
            int ops = 0;
            for (int n : nums) {
                ops += (n - 1) / mid;
            }
            if (ops <= maxOps) high = mid;
            else low = mid + 1;
        }
        return high;
    }
}
