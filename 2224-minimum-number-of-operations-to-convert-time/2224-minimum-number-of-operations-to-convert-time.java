class Solution {
    public int convertTime(String current, String correct) {
        String[] arr=current.split(":");
        int currminutes=Integer.valueOf(arr[0])*60+Integer.valueOf(arr[1]);
        String[] crt=correct.split(":");
        int corrminutes=Integer.valueOf(crt[0])*60+Integer.valueOf(crt[1]);
        int diff=corrminutes-currminutes;
        int[] increments={60,15,5,1};
        int count=0;
        for(int increment:increments){
            count+=diff/increment;
            diff=diff%increment;
        }
        return count;
    }
}