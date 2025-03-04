class Solution {
    public String addBinary(String a, String b) {
        
        int carry=0;
        int l=a.length()-1;
        int r=b.length()-1;
        StringBuilder sb=new StringBuilder();
        while(l>=0||r>=0||carry>0){
            int n1=0;
            int n2=0;
            int sum=0;
            if(l>=0){
                n1=a.charAt(l)-'0';
            }
            if(r>=0){
                n2=b.charAt(r)-'0';
            }
            sum=n1+n2+carry;
            if(sum>2){
                carry=1;
                sum=1;
            }
            else if(sum>1){
                carry=1;
                sum=0;
            }
            else{
                carry=0;
            }
            sb.append(sum);
            l--;
            r--;
        }
        return sb.reverse().toString();
    }
}