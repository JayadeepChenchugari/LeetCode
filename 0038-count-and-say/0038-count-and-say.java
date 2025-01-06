class Solution {
    public String countAndSay(int n) {
        String s="1";
        for(int i=2;i<=n;i++){
            s=Final(s);
        }
        return s;
    }
    public String Final(String s){
        char c=s.charAt(0);
        int count=1;
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<s.length();i++){
            if(c==s.charAt(i)){
                count++;
            }
            else{
                sb.append(count);
                sb.append(c);
                count=1;
                c=s.charAt(i);
            }
        }
        sb.append(count);
        sb.append(c);
        return sb.toString();
    }
}