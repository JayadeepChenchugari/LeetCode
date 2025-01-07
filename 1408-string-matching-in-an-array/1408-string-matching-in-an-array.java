class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ans=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String w1=words[i];
            for(int j=0;j<words.length;j++){
                String w2=words[j];
                if(i!=j && w2.contains(w1)){
                    ans.add(w1);
                    break;
                }
            }
        }
        return ans;
    }
}