class Solution {
    public int minCapability(int[] nums, int k) {
        int left=Integer.MAX_VALUE;
        int right=Integer.MIN_VALUE;
        for(int num:nums){
            left=Math.min(left,num);
            right=Math.max(right,num);
        }
        while(left<right){
            int mid=(right+left)/2;
            if(cap(nums,k,mid)){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
    public boolean cap(int[] nums,int k,int cap){
        int count=0;
        int i=0;
        while(i<nums.length){
            if(nums[i]<=cap){
                count++;
                i++;
            }
            i++;
        }
        return count>=k;
    }
}