class Solution {
    public int[] nextGreaterElement(int[] nums1,int[] nums2) {
      Stack<Integer> st=new Stack<>();
      int[] res=new int[nums2.length];
      for(int i=nums2.length-1;i>=0;i--){
        int ele=nums2[i];
        while(!st.empty()&&st.peek()<=nums2[i]){
            st.pop();
        }
        if(st.empty()){
            res[i]=-1;
        }
        else{
            res[i]=st.peek();
        }
        st.push(ele);
      }
      HashMap<Integer,Integer> mpp=new HashMap<>();
      for(int i=0;i<nums2.length;i++){
        mpp.put(nums2[i],res[i]);
      }
      int ans[]=new int[nums1.length];
      for(int i=0;i<nums1.length;i++){
        ans[i]=mpp.get(nums1[i]);
      }
      return ans;
    }
}