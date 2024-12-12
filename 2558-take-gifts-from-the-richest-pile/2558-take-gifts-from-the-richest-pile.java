import java.util.*;
class Solution {
    public long pickGifts(int[] gifts, int k) {
        while(k>0){
            int max=Integer.MIN_VALUE;
            int index=-1;
            for(int i=0;i<gifts.length;i++){
                if(gifts[i]>max){
                    max=gifts[i];
                    index=i;
                }
            }
            gifts[index]=(int)Math.floor(Math.sqrt(max));
            
            k--;
        }
        long sum=0;
        for(int gift:gifts){
            sum+=gift;
        }
        return sum;
    }
}