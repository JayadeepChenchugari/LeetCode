class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n=nums.length;
        boolean[] ans=new boolean[queries.length];
        int[] prefix=new int[n];
        for(int i=0;i<n-1;i++){
            prefix[i+1]=prefix[i];
            if((nums[i]+nums[i+1])%2==0){
                prefix[i+1]++;
            }
        }
        for(int i=0;i<queries.length;i++){
            int start=queries[i][0];
            int end=queries[i][1];
            if(start==end){
                ans[i]=true;
            }
            else{
                ans[i]=(prefix[end]-prefix[start])==0;
            }
        }
        return ans;
    }
}