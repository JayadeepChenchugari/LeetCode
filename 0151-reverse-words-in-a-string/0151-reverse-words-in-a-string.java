class Solution {
    public String reverseWords(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        int si=n-1;
        while(si>=0){
            while(si>=0&&s.charAt(si)==' '){
                si--;
            }
        if(si<0){
            break;
        }
        int ei=si;
        while(si>=0&&s.charAt(si)!=' '){
            si--;
        }
        if(sb.length()==0){
            sb.append(s.substring(si+1,ei+1));
        }
        else{
            sb.append(' ');
            sb.append(s.substring(si+1,ei+1));
        }
    }
        return sb.toString();
        
    }
}