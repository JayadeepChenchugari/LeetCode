class Solution {
    public boolean isPalindrome(int i,String s) {
        int n=s.length();
        if(i>=n/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(n-i-1)){
            return false;
        }
        return isPalindrome(i+1,s);
    }
    public boolean isPalindrome(String s){
        StringBuilder cleaned=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                cleaned.append(Character.toLowerCase(c));
            }
        }
        return isPalindrome(0,cleaned.toString());
    }
}