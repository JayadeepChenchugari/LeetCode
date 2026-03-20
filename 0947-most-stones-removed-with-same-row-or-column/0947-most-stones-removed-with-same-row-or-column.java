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
    void union(int x, int y){
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
    }
}
class Solution {
    public int removeStones(int[][] stones) {
        int n=stones.length;
        int maxRow=0;
        int maxCol=0;
        for(int i=0;i<n;i++){
            maxRow=Math.max(maxRow , stones[i][0]);
            maxCol=Math.max(maxCol , stones[i][1]);
        }
        DisjointSet ds=new DisjointSet(maxRow+maxCol+2);
        HashMap<Integer , Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int rowNode=stones[i][0];
            int colNode=stones[i][1]+maxRow+1;
            ds.union(rowNode , colNode);
            map.put(rowNode, 1);
            map.put(colNode , 1);
        }
        int cnt=0;
        for(Map.Entry<Integer, Integer> it:map.entrySet()){
            if(ds.find(it.getKey())==it.getKey()){
                cnt++;
            }
        }
        return n-cnt;
    }
}