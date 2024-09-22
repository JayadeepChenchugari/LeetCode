class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int x=0;x<matrix.length;x++){
            int left=0;
            int right=matrix.length-1;
            while(left<right){
                int temp=matrix[x][right];
                matrix[x][right]=matrix[x][left];
                matrix[x][left]=temp;
                left++;
                right--;
            }
        }
    }
}