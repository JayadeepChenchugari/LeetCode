class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length;
        int m=image[0].length;
        int[][] ans=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[i][j]=image[i][j];
            }
        }
        int initcolor = image[sr][sc];
        dfs(image , sr , sc  , initcolor , color ,  ans);
        return ans;
    }
    public static void dfs(int[][] image , int row , int col , int initcolor  , int color , int[][] ans){
         ans[row][col]=color;
        int n=image.length;
        int m= image[0].length;
        int drow[] = {1,-1,0,0};
        int dcol[]= {0,0,1,-1};
        for(int i=0;i<4;i++){
            int nrow= row + drow[i];
            int ncol= col + dcol[i];
            if(nrow < n && nrow>=0 && ncol>=0 && ncol< m && image[nrow][ncol]== initcolor && ans[nrow][ncol]!=color ){
                dfs(image , nrow , ncol ,initcolor ,  color , ans);
            }
        }
    }
}