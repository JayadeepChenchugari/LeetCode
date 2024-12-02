class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        List<String> wordsList=new ArrayList<>();
        StringBuilder word=new StringBuilder();
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)!=' '){
                word.append(sentence.charAt(i));
            }
            else{
                if(word.length()>0){
                    wordsList.add(word.toString());
                    word.setLength(0);
                }
            }
        }
        if(word.length()>0){
                wordsList.add(word.toString());
        }
        for(int wordIndex=0;wordIndex<wordsList.size();wordIndex++){
            String wordd=wordsList.get(wordIndex);
            if(wordd.length()>=searchWord.length()){
                boolean isMatch=true;
                for(int charIndex=0;charIndex<searchWord.length();charIndex++){
                    if(wordd.charAt(charIndex)!=searchWord.charAt(charIndex)){
                        isMatch=false;
                        break;
                    }
                }
                if(isMatch==true){
                return wordIndex+1;
            }
            }
        }
        return -1;
    }
}