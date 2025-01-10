class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] tempCharfreq=new int[26];
        int[] maxCharfreq=new int[26];
        for(String word:words2){
            Arrays.fill(tempCharfreq,0);
            for(char c:word.toCharArray()){
                tempCharfreq[c-'a']++;
            }
            for(int i=0;i<26;i++){
                maxCharfreq[i]=Math.max(maxCharfreq[i],tempCharfreq[i]);
            }
        }
        List<String> universal=new ArrayList<>();
        for(String word:words1){
            Arrays.fill(tempCharfreq,0);
            for(char c:word.toCharArray()){
                tempCharfreq[c-'a']++;
            }
            boolean issubset=true;
            for(int i=0;i<26;i++){
                if(maxCharfreq[i]>tempCharfreq[i]){
                    issubset= false;
                    break;
                }
            }
            if(issubset){
                universal.add(word);
            }
        }
        return universal;
    }
}