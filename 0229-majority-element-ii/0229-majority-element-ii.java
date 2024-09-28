class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hash.put(nums[i],hash.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++){
            if(hash.get(nums[i])>(nums.length)/3){
                if(!ans.contains(nums[i])){
                    ans.add(nums[i]);
                }
                if(ans.size()==2){
                    break;
                }
            }
        }
        return ans;
    }
}