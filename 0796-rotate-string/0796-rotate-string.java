class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String s1=s.concat(s);
        return s1.contains(goal);
    }
}