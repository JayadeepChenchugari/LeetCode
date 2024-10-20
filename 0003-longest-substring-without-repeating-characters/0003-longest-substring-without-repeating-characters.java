class Solution {
    public int lengthOfLongestSubstring(String s) {
      int l=0;
      int r=0;
      int n=s.length();
      int maxlength=0;
      int[] hash=new int[256];
      for(int i=0;i<hash.length;i++){
        hash[i]=-1;
      }
      while(r<n){
          if(hash[s.charAt(r)]!=-1){
             if(hash[s.charAt(r)]>=l){
                l=hash[s.charAt(r)]+1;
             }
          }
          int len=r-l+1;
          maxlength=Math.max(maxlength,len);
          hash[s.charAt(r)]=r;
          r++;
      }
      return maxlength;
    }
}