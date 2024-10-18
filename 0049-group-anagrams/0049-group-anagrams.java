class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map<String, List<String>> ans = new HashMap<>();

        // for (String s : strs) {
        //     char[] chars = s.toCharArray();
        //     Arrays.sort(chars);
        //     String key = new String(chars);
        //     if (!ans.containsKey(key)) {
        //         ans.put(key, new ArrayList<>());
        //     }
        //     ans.get(key).add(s);
        // }

        // return new ArrayList<>(ans.values());

        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            char[] chars=s.toCharArray();
            Arrays.sort(chars);
            String key=new String(chars);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
        }        
        return new ArrayList<>(map.values());
    }
}