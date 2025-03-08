class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        sb.append(s);
        String S=sb.toString();
        if(S.contains(goal)){
            return true;
        }
        return false;
    }
}