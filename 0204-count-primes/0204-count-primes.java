class Solution {
    public int countPrimes(int n) {
        if(n<=2){
            return 0;
        }
        boolean[] isPrime=new boolean[n];
        for(int i=2;i<n;i++){
            isPrime[i]=true;
        } 
        for(int i=2;i*i<n;i++){
            if(!isPrime[i]){
                continue;
            }
            for(int j=i*i;j<n;j=j+i){
                isPrime[j]=false;
            }
        }
        int count=0;
        for(boolean b:isPrime){
            if(b){
                count++;
            }
        }
        return count;
    }
}