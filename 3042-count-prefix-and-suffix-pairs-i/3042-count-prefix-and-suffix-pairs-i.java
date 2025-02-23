class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int n=words.length;
        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(isPrefixSuffix(words[i],words[j])){
                    count++;
                }
            }
        }
        return count;
    }
    public boolean isPrefixSuffix(String s1,String s2){
        int l=s1.length();
        int m=s2.length();
        if(l>m){
            return  false;
        }
        return s2.startsWith(s1) && s2.endsWith(s1);
    }
}