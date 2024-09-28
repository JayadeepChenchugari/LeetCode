class Solution {
    public static void rev(int nums[],int low,int high){
        while(low<high){
            int temp=nums[low];
            nums[low++]=nums[high];
            nums[high--]=temp;
        }
    }
    public static void nextPermutation(int[] nums) {
        int n=nums.length;
        int index=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
               index=i;
               break;
            }
        } 
        if(index==-1){
            rev(nums,0,n-1);
            return;
        }
        for(int i=n-1;i>=0;i--){
            if(nums[i]>nums[index]){
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
                break;
            }
        }
        rev(nums,index+1,n-1);
        return;
    }
}