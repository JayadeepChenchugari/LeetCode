class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        StringBuilder sb=new StringBuilder();
        if(s.isEmpty()){
            return 0;
        }
        int sign=1;
        int i=0;
        if(s.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        else if(s.charAt(i)=='+'){
            i++;
        }
        while(i<s.length()&&Character.isDigit(s.charAt(i))){
            sb.append(s.charAt(i));
            i++;
        }
        if(sb.length()==0){
            return 0;
        }
        try{
            return sign*Integer.parseInt(sb.toString());
        }catch(NumberFormatException e){
            return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
        }
    }
}