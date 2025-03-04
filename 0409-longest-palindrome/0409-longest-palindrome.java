class Solution {
    public int longestPalindrome(String s) {
        int[] count=new int[256];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'A']++;
        }
        int ans=0;
        int oddcnt=0;
        for(int i=0;i<s.length();i++){
            int a=count[s.charAt(i)-'A'];
            if(a%2==0){
                ans+=a;
                count[s.charAt(i)-'A']=0;
            }
            else if(a%2!=0){
                ans=ans+a-1;
                 count[s.charAt(i)-'A']=0;
                 oddcnt++;
            }
            
        }
        if(oddcnt>0){
            ans++;
        }
        return ans;
    }
}