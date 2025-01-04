class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        s=s.replaceAll("\\s+"," ");
        String[] str=s.split(" ");
        StringBuilder ans=new StringBuilder();
        for(int i=str.length-1;i>0;i--){
            ans.append(str[i]);
            ans.append(" ");
        }
        ans.append(str[0]);
        return ans.toString();
    }
}