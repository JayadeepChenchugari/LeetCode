import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder str=new StringBuilder();
        for(int digit:digits){
            str.append(digit);
        }
        BigInteger num=new BigInteger(str.toString());
        num=num.add(BigInteger.ONE);
        String s=num.toString();
        int[] res=new int[s.length()];
        for(int i=0;i<s.length();i++){
            res[i]=Character.getNumericValue(s.charAt(i));
        }
        return res;
    }
}
