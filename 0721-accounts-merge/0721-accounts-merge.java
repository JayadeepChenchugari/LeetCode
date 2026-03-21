import java.util.*;
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
    void union(int x , int y){
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
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        int n=accounts.size();
        DisjointSet ds=new DisjointSet(n);
        HashMap<String , Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=1;j<accounts.get(i).size();j++){
                String mail=accounts.get(i).get(j);
                if(map.containsKey(mail)==false){
                    map.put(mail,i);
                }
                else{
                    ds.union(i , map.get(mail));
                }
            }
        }
        List<List<String>> ls=new ArrayList<>();
        for(int i=0;i<n;i++){
            ls.add(new ArrayList<>());
        }
        for(Map.Entry<String , Integer> it:map.entrySet()){
            String mail=it.getKey();
            int node=ds.find(it.getValue());
            ls.get(node).add(mail);
        }
        List<List<String>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(ls.get(i).size()==0){
                continue;
            }
            Collections.sort(ls.get(i));
            List<String> temp=new ArrayList<>();
            temp.add(accounts.get(i).get(0));
            for(String it:ls.get(i)){
                temp.add(it);
            }
            ans.add(temp);
        }
        return ans;
    }
}