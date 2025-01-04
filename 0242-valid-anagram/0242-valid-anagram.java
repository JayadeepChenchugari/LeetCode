class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr=new int[26];
        s=s.toLowerCase();
        t=t.toLowerCase();
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            arr[t.charAt(i)-'a']--;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
}