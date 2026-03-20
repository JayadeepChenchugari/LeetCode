class DisjointSet {

    int[] parent;
    int[] size;

    DisjointSet(int n) {

        parent = new int[n];
        size = new int[n];

        for(int i=0;i<n;i++){
            parent[i]=i;
            size[i]=1;
        }
    }

    int find(int x){
        if(parent[x]!=x)
            parent[x]=find(parent[x]);

        return parent[x];
    }

    void union(int x,int y){

        int px=find(x);
        int py=find(y);

        if(px==py) return;

        if(size[px]<size[py]){
            parent[px]=py;
            size[py]+=size[px];
        }
        else{
            parent[py]=px;
            size[px]+=size[py];
        }
    }
}
class Solution {
    boolean isValid(int newr , int newc , int n){
            return newr>=0 && newr<n && newc>=0 && newc<n;
        }
    public int largestIsland(int[][] grid) {
        int n=grid.length;
        DisjointSet ds=new DisjointSet(n*n);
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                if(grid[row][col]==0){
                    continue;
                }
                int dr[]={-1,0,1,0};
                int dc[]={0,-1,0,1};
                for(int ind=0;ind<4;ind++){
                    int newr=row+dr[ind];
                    int newc=col+dc[ind];
                     if(isValid(newr , newc, n) && grid[newr][newc]==1){
                        int nodeNo=row*n+ col;
                        int adjNodeNo=newr*n+newc;
                        ds.union(nodeNo, adjNodeNo);
                     }
                }
            }
        }
        int mx=0;
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                if(grid[row][col]==1){
                    continue;                
                }
                int dr[]={-1,0,1,0};
                int dc[]={0,-1,0,1};
                HashSet<Integer> components=new HashSet<>();
                for(int ind=0;ind<4;ind++){
                    int newr=row+dr[ind];
                    int newc=col+dc[ind];
                    if(isValid(newr, newc , n)){
                        if(grid[newr][newc]==1){
                            components.add(ds.find(newr*n+newc));
                        }
                    }
                }
                int sizeTotal=0;
                for(Integer parents:components){
                    sizeTotal+=ds.size[parents];
                }
                mx=Math.max(sizeTotal+1 , mx);
            }
        }
        for(int cellNo=0;cellNo<n*n;cellNo++){
            mx=Math.max(mx, ds.size[ds.find(cellNo)]);
        }
        return mx;
    }
}