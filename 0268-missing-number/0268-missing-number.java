class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int i=1;i<=nums.length;i++){
            sum+=i;
        }
        int res=0;
        for(int i=0;i<nums.length;i++){
            res+=nums[i];
        }
        int ans=sum-res;
        return ans;
    }
}