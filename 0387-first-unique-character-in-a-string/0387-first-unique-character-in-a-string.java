class Solution {
    public int firstUniqChar(String s) {
        int index=-1;
        HashMap<Character,Integer> ans=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int freq=ans.getOrDefault(c,0);
            ans.put(c,(freq+1));
        }
        for(int i=0;i<s.length();i++){
            if(ans.get(s.charAt(i))==1){
                index=i;
                break;
            }
        }
        return index;
    }
}