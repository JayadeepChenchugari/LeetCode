class Group{
    int x;
    int y;
    int t;

    public Group(int x,int y,int t){
        this.x=x;
        this.y=y;
        this.t=t;
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int freshOrange=0;
        int convertedOrange=0;
        int minTime=0;
        Queue<Group> q=new LinkedList<>();
        int row[]={0,-1,0,1};
        int col[]={-1,0,1,0};

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new Group(i,j,0));
                }else if(grid[i][j]==1){
                    freshOrange++;
                }
            }
        }

        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Group g=q.remove();
                int x=g.x;
                int y=g.y;
                int t=g.t;
                minTime=t;
                for(int j=0;j<4;j++){
                    int a=x+row[j];
                    int b=y+col[j];
                    if(a>=0 && a<n && b>=0 && b<m && grid[a][b]==1){
                        grid[a][b]=2;
                        convertedOrange++;
                        q.add(new Group(a,b,t+1));
                    }
                }
            }
        }
        if(convertedOrange==freshOrange){
            return minTime;
        }
        return -1;
    }
}