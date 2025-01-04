class Solution {
    public boolean isIsomorphic(String s, String t) {
        int S=s.length();
        int T=t.length();
        HashMap<Character,Character> map=new HashMap<>();
        if(S!=T){
            return false;
        }
        for(int i=0;i<S;i++){
            char original=s.charAt(i);
            char replacement=t.charAt(i);
            if(!map.containsKey(original)){
                if(!map.containsValue(replacement)){
                    map.put(original,replacement);
                }
                else{
                    return false;
                }
            }
            else{
                char getoriginal=map.get(original);
                if(getoriginal!=replacement){
                    return false;
                }
            }
        }
        return true;
    }
}