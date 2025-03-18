class Solution {
    public int longestNiceSubarray(int[] nums) {
        int maxlen=0;
        int l=0;
        int usedbits=0;
        for(int r=0;r<nums.length;r++){
            while((nums[r]&usedbits)!=0){
                usedbits^=nums[l];
                l++;
            }
            usedbits|=nums[r];
            maxlen=Math.max(maxlen,r-l+1);
        }
        return maxlen;
    }
}