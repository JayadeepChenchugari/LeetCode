class Solution {
    public int tupleSameProduct(int[] nums) {
        int res=0;
        HashMap<Integer,Integer> ans=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int product=nums[i]*nums[j];
                res+=8*ans.getOrDefault(product,0);
                ans.put(product,ans.getOrDefault(product,0)+1);
            }
        }
        return res;
    }
}