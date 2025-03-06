class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                int a=grid[i][j];
                map.put(a,map.getOrDefault(a,0)+1);
            }
        }
        int n=grid.length;
        int[] ans=new int[2];
        int missing=0;
        int repeat=0;
        for(int i=1;i<=n*n;i++){
            int a=map.getOrDefault(i,0);
            if(a==0){
                missing=i;
            }
            if(a>1){
                repeat=i;
            }
        }
        ans[0]=repeat;
        ans[1]=missing;
        return ans;
    }
}