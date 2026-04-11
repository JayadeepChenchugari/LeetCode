class Pair{
    String first;
    int second;
    Pair(String first , int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> q=new LinkedList<>();
        Set<String> set=new HashSet<>();
        for(int i=0;i<wordList.size();i++){
            set.add(wordList.get(i));
        }
        q.add(new Pair(beginWord,1));
        while(!q.isEmpty()){
            String word=q.peek().first;
            int steps=q.peek().second;
            q.remove();
            if(word.equals(endWord)==true){
                return steps;
            }
            for(int i=0;i<word.length();i++){
                for(char c='a';c<='z';c++){
                    char[] replacedChar=word.toCharArray();
                    replacedChar[i]=c;
                    String replacedWord=new String(replacedChar);
                    if(set.contains(replacedWord)==true){
                        set.remove(replacedWord);
                        q.add(new Pair(replacedWord,steps+1));
                    }
                }
            }
        }
        return 0;
    }
}