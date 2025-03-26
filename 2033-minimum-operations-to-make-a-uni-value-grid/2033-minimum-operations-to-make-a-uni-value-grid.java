class Solution {
    public int minOperations(int[][] grid, int x) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                list.add(grid[i][j]);
            }
        }
        int mod=list.get(0)%x;
        for(int num:list){
            if(num%x!=mod){
                return -1;
            }
        }
        Collections.sort(list);
        int median=list.get(list.size()/2);
        int operations=0;
        for(int num:list){
            operations+=Math.abs(num-median)/x;
        }
        return operations;
    }
}