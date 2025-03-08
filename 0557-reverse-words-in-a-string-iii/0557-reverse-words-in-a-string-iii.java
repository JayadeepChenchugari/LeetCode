class Solution {
    public String reverseWords(String s) {
       StringBuilder sb=new StringBuilder();
       String[] arr=s.split(" ");
       for(int i=0;i<=arr.length-2;i++){
        String a=arr[i];
        for(int j=a.length()-1;j>=0;j--){
            sb.append(a.charAt(j));
        }
        sb.append(" ");
       }
       String b=arr[arr.length-1];
       for(int i=b.length()-1;i>=0;i--){
        sb.append(b.charAt(i));
       }
       return sb.toString();
    }
}