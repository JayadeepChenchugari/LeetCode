class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for(int i=0;i<words.length;i++){
            if(isPrefix(words[i],pref)){
                count++;
            }
        }
        return count;
    }
    public boolean  isPrefix(String s1,String s2){
        return s1.startsWith(s2);
    }
}