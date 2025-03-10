class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(i==j){
                    continue;
                }
                if(isPrefixAndSuffix(words[i],words[j])&& i<j){
                    count++;
                }
            }
        }
        return count;
    }
    public boolean isPrefixAndSuffix(String s1,String s2){
        if(s2.startsWith(s1)&& s2.endsWith(s1)){
            return true;
        }
        return false;
    }
}