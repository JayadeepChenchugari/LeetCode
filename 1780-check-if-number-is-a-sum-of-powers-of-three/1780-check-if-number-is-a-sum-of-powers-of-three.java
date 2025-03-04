class Solution {
    public boolean checkPowersOfThree(int n) {
        int[] res=new int[17];
        for(int i=0;i<17;i++){
            res[i]=(int)Math.pow(3,i);
        }
        for(int i=16;i>=0;i--){
            if(res[i]<=n){
                n=n-res[i];
            }
        }
        return n==0;
    }
}