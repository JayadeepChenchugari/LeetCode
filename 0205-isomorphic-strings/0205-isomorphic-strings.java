class Solution {
    public boolean isIsomorphic(String s, String t) {
        int l=s.length();
        int m=t.length();
        if(l!=m){
            return false;
        }
        int[] mapS=new int[256];
        int[] mapT=new int[256];
        for(int i=0;i<l;i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(mapS[c1]!=0 && mapS[c1]!=c2 || mapT[c2]!=0 && mapT[c2]!=c1){
                return false;
            }
            mapS[c1]=c2;
            mapT[c2]=c1;
        }
        return true;
    }
}