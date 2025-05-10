class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long s1=0;
        long c1=0;
        for(int i:nums1){
            s1+=i;
            if(i==0){
                c1++;
            }
        }
        long s2=0;
        long c2=0;
        for(int i:nums2){
            s2+=i;
            if(i==0){
                c2++;
            }
        }
        long min1=s1+c1;
        long min2=s2+c2;
        if(c1==0&&c2==0){
            return s1==s2?s1:-1;
        }else if(c1==0){
            return s2+c2<=s1?s1:-1;
        }else if(c2==0){
            return s1+c1<=s2?s2:-1;
        }
        return Math.max(min1,min2);
    }
}