class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> charCount=new HashMap<>();
        for(char c:s.toCharArray()){
            charCount.put(c,charCount.getOrDefault(c,0)+1);
        }
        List<Character> sortedChars=new ArrayList<>(charCount.keySet());
        Collections.sort(sortedChars,(a,b)->charCount.get(b)-charCount.get(a));
        StringBuilder sb=new StringBuilder();
        for(char c:sortedChars){
            for(int i=0;i<charCount.get(c);i++){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}