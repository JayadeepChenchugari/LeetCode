class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++){
            if(isConsistent(allowed,words[i])){
                count++;
            }
        }
        return count;
    }
    public boolean isConsistent(String s1,String s2){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            map.put(s1.charAt(i),i);
        }
        for(int i=0;i<s2.length();i++){
            if(!map.containsKey(s2.charAt(i))){
                return false;
            }
        }
        return true;
    }
}