class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int[] arr=new int[j-i+1];
                System.arraycopy(nums, i, arr, 0, j-i+1);
                if(isDistinct(nums,arr)){
                    ans++;
                }
            }
        }
        return ans;
    }
    public boolean isDistinct(int[] nums,int[] arr){
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map1.put(nums[i],map1.getOrDefault(nums[i],0)+1);
        }
        int count1=0;
        for(int value:map1.values()){
            count1++;
        }
        for(int i=0;i<arr.length;i++){
            map2.put(arr[i],map2.getOrDefault(arr[i],0)+1);
        }
        int count2=0;
        for(int value:map2.values()){
            count2++;
        }
        if(count1==count2){
            return true;
        }
        return false;
    }
}