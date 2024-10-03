class Solution {
    public int minSubarray(int[] nums, int p) {
        long totalSum=0;
        for(int num:nums){
            totalSum+=num;
        }
        int rem=(int)(totalSum%p);
        if(rem==0){
            return 0;
        }
        HashMap<Integer,Integer> prefixMod=new HashMap<>();
        prefixMod.put(0,-1);
        long prefixSum=0;
        int minlength=nums.length;
        for(int i=0;i<nums.length;i++){
            prefixSum+=nums[i];
            int currentMod=(int)(prefixSum%p);
            int target=(currentMod-rem+p)%p;
            if(prefixMod.containsKey(target)){
                minlength=Math.min(minlength,i-prefixMod.get(target));
            }
            prefixMod.put(currentMod,i);
        } 
        return minlength==nums.length?-1 : minlength;
    }
}