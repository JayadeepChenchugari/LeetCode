class Solution {
    public String toHex(int num) {
        if(num==0){
            return "0";
        }
        StringBuilder sb=new StringBuilder();
        char[] hex=new char[]{'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        int count=0;
        while(count<8&&num!=0){
            sb.append(hex[num&15]);
            num=num>>4;
            count++;
        }
        return sb.reverse().toString();
    }
}