class Solution {
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        int[][] vis=new int[n][m];
        int[] delrow={-1 , 0 , 1 , 0};
        int[] delcol= {0,1,0,-1};
        for(int i=0;i<n;i++){
            if(board[i][0]=='O' && vis[i][0]==0){
                dfs(delrow , delcol ,vis , board , i , 0 );
            }
            if(board[i][m-1]=='O' && vis[i][m-1]==0){
                dfs(delrow , delcol ,vis , board , i , m-1);
            }
        }
        for(int j=0;j<m;j++){
            if(board[0][j]=='O' && vis[0][j]==0){
                dfs(delrow , delcol ,vis , board , 0 , i);
            }
            if(board[j][n-1]=='O' && vis[j][n-1]==0){
                dfs(delrow , delcol , vis , board , 0 , n-1);
            }
        }
        for(int i=0; i <n ;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0 && board[i][j]=='O'){
                    board[i][j]='X';
                }
            }
        }
    }
    static void dfs(int[] delrow , int[] delcol ,int[][] vis , char[][] board , int row , int col){
        vis[row][col]=1;
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<4;i++){
            int nrow=row+delrow[i];
            int ncol=col+delcol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && board[nrow][ncol]=='O'){
                dfs(delrow , delcol , vis , board , nrow , ncol);
            }
        }
    }
}