class Solution {
    public int maximumCount(int[] nums) {
        int nos=0,pos=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                nos++;
            }
            else if(nums[i]==0){
                continue;
            }
            else{
                pos++;
            }
        }
        return Math.max(pos,nos);
    }
}