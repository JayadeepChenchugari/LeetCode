class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> ans=new ArrayList<>();
        int V=graph.length;
        int[] vis=new int[V];
        int[] pathVis=new int[V];
        int[] check=new int[V];
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                dfs(i , vis , graph , pathVis , check);
            }
        }
        for(int i=0;i<V;i++){
            if(check[i]==1){
                ans.add(i);
            }
        }
        return ans;
    }
    public boolean dfs(int node , int[] vis,int[][] graph,int[] pathVis , int[] check){
        vis[node]=1;
        pathVis[node]=1;
        check[node]=0;
        for(int it:graph[node]){
            if(vis[it]==0){
                if(dfs(it , vis , graph , pathVis , check)==true){
                    return true;
                }
            }
            else if(pathVis[it]==1){
                return true;
            }
        }
        check[node]=1;
        pathVis[node]=0;
        return false;
    }
}