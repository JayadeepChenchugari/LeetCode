import java.util.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         int len=(m+n);
         int gap=(len/2)+(len%2);
         while(gap>0){
            int left=0;
            int right=left+gap;
            while(right<len){
                if(right<m){
                    if(nums1[left]>nums1[right]){
                        swap(nums1,nums1,left,right);
                    }
                }
                else if(left<m){
                    if(nums1[left]>nums2[right-m]){
                        swap(nums1,nums2,left,right-m);
                    }
                }
                else{
                    if(nums2[left-m]>nums2[right-m]){
                        swap(nums2,nums2,left-m,right-m);
                    }
                }
                left++;
                right++;
            }
            if(gap==1){
                break;
            }
            gap=(gap/2)+(gap%2);
         }
         System.arraycopy(nums2,0,nums1,m,n);
    }
    public void swap(int[] nums1,int[] nums2,int index1,int index2){
        int temp=nums1[index1];
        nums1[index1]=nums2[index2];
        nums2[index2]=temp;
    }
}