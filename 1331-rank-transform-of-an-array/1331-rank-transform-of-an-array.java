class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer,Integer> valuerank=new HashMap<>();
        int[] sortedUniqueNumbers=Arrays.stream(arr).distinct().sorted().toArray();
        for(int i=0;i<sortedUniqueNumbers.length;i++){
            valuerank.put(sortedUniqueNumbers[i],i+1);
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=valuerank.get(arr[i]);
        }
        return arr;
    }
}