class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int index=0;
        nums[index]=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]){
                index++;
                nums[index]=nums[i];
            }
        }
        return index+1;
    }
}