import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
        long dup=x;
        long revNum=0;
        while(x>0){
            int last_digit=x%10;
            revNum=(revNum*10)+last_digit;
            x=x/10;
        }
        int ans=(int)revNum;
        if(ans==dup){
            return true;
        }
        return false;
    }
}