class Solution {
    public String reversePrefix(String word, char ch) {
        int firstoccurence=word.indexOf(ch);
        if(firstoccurence==-1){
            return word;
        }
        Stack<Character> reverse=new Stack<>();
        for(int i=0;i<=firstoccurence;i++){
            reverse.push(word.charAt(i));
        }
        StringBuilder res=new StringBuilder();
        while(!reverse.isEmpty()){
            res.append(reverse.pop());
        }
        for(int i=firstoccurence+1;i<word.length();i++){
            res.append(word.charAt(i));
        }
        return res.toString();
    }
}