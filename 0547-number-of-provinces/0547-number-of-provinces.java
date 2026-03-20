class DisjointSet{
    int[] parent;
    int[] size;
    public DisjointSet(int n){
        parent=new int[n];
        size=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
            size[i]=1;
        }
    }
    int find(int x){
        if(parent[x]!=x){
            parent[x]=find(parent[x]);
        }
        return parent[x];
    }
    void unionBySize(int x , int y){
        int px=find(x);
        int py=find(y);
        if(px==py){
            return;
        }
        if(size[px]<size[py]){
            parent[px]=py;
            size[py]+=size[px];
        }
        else if(size[px]>size[py]){
            parent[py]=px;
            size[px]+=size[py];
        }
        else{
            parent[px]=py;
            size[py]+=size[px];
        }
        return;
    }
}
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        DisjointSet ds=new DisjointSet(n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1){
                    ds.unionBySize(i , j);
                }
            }
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            if(ds.find(i)==i){
                cnt++;
            }
        }
        return cnt;
    }
}