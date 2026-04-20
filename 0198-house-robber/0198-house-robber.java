class Solution {
    public int rob(int[] nums) {
        int prev=nums[0];
        int n=nums.length;
        int prev2=0;

        for(int i=1;i<n;i++){
            int pick=nums[i];
            if(i>1){
                pick+=prev2;
            }
            int notPick=prev;
            int cur=Math.max(pick , notPick);
            prev2=prev;
            prev=cur;
        }
        return prev;
    }
}