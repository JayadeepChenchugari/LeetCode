class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> count=new HashMap<>();
        List<Integer> ans=new ArrayList<>();
        for(int num:nums1){
            count.put(num,count.getOrDefault(num,0)+1);
        }
        for(int num:nums2){
            if(count.getOrDefault(num,0)>0){
                ans.add(num);
                count.put(num,count.getOrDefault(num,0)-1);
            }
        }
        int[] res=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            res[i]=ans.get(i);
        }
        return res;
    }
}