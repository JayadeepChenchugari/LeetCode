class Solution {
    public int[] closestPrimes(int left, int right) {
        if(right<=1){
            return new int[]{-1,-1};
        }
        // int n=right-left;

        boolean[] isPrime=new boolean[right+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;
        for(int i=2;i*i<=right;i++){
            if(!isPrime[i]){
                continue;
            }
            for(int j=i*i;j<=right;j=j+i){
                isPrime[j]=false;
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isPrime[i]){
                ans.add(i);
            }
        }
        int[] res=new int[2];
        int min=Integer.MAX_VALUE;
        res[0]=-1;
        res[1]=-1;
        for (int i = 1; i < ans.size(); i++) {
            int num1 = ans.get(i - 1);
            int num2 = ans.get(i);
            int diff = num2 - num1;

            if (diff < min) {
                min = diff;
                res[0] = num1;
                res[1] = num2;
            }
        }
        return res;
    }
}