class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
            for(int j=i-1;j>=0;j--){
                if((arr[j]|arr[i])==arr[j]){
                    break;
                }
                arr[j]=arr[j]|arr[i];
                set.add(arr[j]);
            }
        }
        return set.size();
    }
}