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
    public int makeConnected(int n, int[][] connections) {
        int cntExtras=0;
        DisjointSet ds=new DisjointSet(n);
        for(int i=0;i<connections.length;i++){
            int u=connections[i][0];
            int v=connections[i][1];
            if(ds.find(u)==ds.find(v)){
                cntExtras++;
            }
            else{
                ds.union(u,v);
            }
        }
        int cntConnected=0;
        for(int i=0;i<n;i++){
            if(ds.find(i)==i){
                cntConnected++;
            }
        }
        int ans=cntConnected-1;
        if(cntExtras>=ans){
            return ans;
        }
        return -1;
    }
}