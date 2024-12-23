class Solution {
    public int addDigits(int num) {
        if(num%10==num){
            return num;
        }
      int n=num/10;
      int l=num%10;
      int ans=addDigits(n+l);
        return ans;
    }
}