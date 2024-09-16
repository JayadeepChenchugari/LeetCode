class Solution {
    public int subarraySum(int[] nums, int k) {
       int sum=0;
       int count=0;
       HashMap<Integer,Integer> prefixSum=new HashMap<>();
       prefixSum.put(0, 1);
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            int rem=sum-k;
            
            if(prefixSum.containsKey(rem)){
                count=count+prefixSum.get(rem);
            }
           prefixSum.put(sum, prefixSum.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}