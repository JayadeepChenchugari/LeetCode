import java.util.*;
class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct=Integer.MIN_VALUE;
        int prefix=1;
        int suffix=1;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(prefix==0){
                prefix=1;
            }
            if(suffix==0){
                suffix=1;
            }
            prefix=prefix*nums[i];
            suffix=suffix*nums[n-i-1];
            maxProduct=Math.max(maxProduct,Math.max(prefix,suffix));
        }
        return maxProduct;
    }
}