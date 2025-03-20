class Solution {
    public int findMinDifference(List<String> timePoints) {
        int[] minutes=new int[timePoints.size()];
        for(int i=0;i<minutes.length;i++){
            String s=timepoints.get(i);
            int a=Integer.parseInt(s.substring(0,2));
            int b=Integer.parseInt(s.substring(3));
            minutes[i]=a*60+b;
        }
        Arrays.sort(minutes);
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<minutes.length-1;i++){
            ans=Math.min(ans,minutes[i+1]-minutes[i]);
        }
        return Math.min(ans,24*60 -minutes[minutes.length-1]+minutes[0]);
    }
}