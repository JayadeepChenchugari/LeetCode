class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(int i=0;i<details.length;i++){
            String ele=details[i];
            int age=Integer.parseInt(ele.substring(11,13));
            if(age>60){
                count++;
            }
        }
        return count;
    }
}