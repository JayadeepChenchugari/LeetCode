class Solution {
    public String addStrings(String num1, String num2) {
        
        int l=num1.length()-1;
        int r=num2.length()-1;
        int carry=0;
        StringBuilder sb=new StringBuilder();
        while(l>=0||r>=0||carry>0){
            
            int n1=0;
        int n2=0;
            int sum=0;
            if(l>=0){
                 n1=num1.charAt(l)-'0';
            }
            if(r>=0){
                 n2=num2.charAt(r)-'0';
            }
            sum=n1+n2;
            if(carry>0){
                sum=sum+carry;
            }
               carry=sum/10;
                sum=sum%10;
            
            l--;
            r--;
            sb.append(sum);
        }
        return sb.reverse().toString();
    }
}