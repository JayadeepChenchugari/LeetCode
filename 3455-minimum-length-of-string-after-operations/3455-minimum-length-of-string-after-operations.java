class Solution {
    public int minimumLength(String s) {
        int[] freq=new int[26];
        int ans=s.length();
        for(char c:s.toCharArray()){
            freq[c-'a']++;
            if(freq[c-'a']!=1&&freq[c-'a']%2==1){
                ans-=2;
            }
        }
        return ans;
    }
}