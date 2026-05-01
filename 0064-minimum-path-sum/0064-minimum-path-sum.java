class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        for(int[] row:dp){
            Arrays.fill(row ,-1);
        }
        int ans=sumPath(0,0,grid , dp);
        return ans;
    }
    public int sumPath(int i , int j ,int[][] grid  , int[][] dp){
        int m=grid.length;
        int n=grid[0].length;
        if(i>=m || j>=n){
            return Integer.MAX_VALUE;
        }
        if(i==m-1 && j==n-1){
            return grid[i][j];
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int left = sumPath( i+1 , j , grid , dp);
        int right = sumPath(i ,j+1  ,grid , dp);
        return dp[i][j] = grid[i][j] + Math.min(left , right);
    }
}