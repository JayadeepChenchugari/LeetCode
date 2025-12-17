class Solution {
    public int numEnclaves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] vis=new int[n][m];
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 || i==n-1 || j==0 || j==m-1){
                    if(grid[i][j]==1){
                        q.add(new int[]{i,j});
                        vis[i][j]=1;
                    }
                }
            }
        }
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int[] curr=q.poll();
            int r=curr[0] , c=curr[1];
            for(int[] d:dir){
                int row=r+d[0];
                int col=c+d[1];
                if(row>=0 && row<n && col>=0 && col<m && vis[row][col]==0 && grid[row][col]==1){
                    vis[row][col]=1;
                    q.add(new int[]{row , col});
                }
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0 && grid[i][j]==1){
                    ans++;
                }
            }
        }
        return ans;
    }
}