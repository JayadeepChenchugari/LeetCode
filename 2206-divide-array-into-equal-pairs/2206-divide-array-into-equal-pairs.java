class Solution {
    public boolean divideArray(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        if(set.size()>nums.length/2){
            return false;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int value:map.values()){
            if(value%2!=0){
                return false;
            }
        }
        return true;
    }
}