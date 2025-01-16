class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int c1=0;
        int c2=0;
        if(n%2!=0){
            for(int num:nums2){
                c1=c1^num;
            }
        }
        if(m%2!=0){
            for(int num:nums1){
                c2=c2^num;
            }
        }
        return c1^c2;
    }
}