class Solution {
    public boolean canAliceWin(int[] nums) {

        int singleSum = 0;
        int doubleSum = 0;
        int digits = 0;

        for(int x : nums){
            if(x > 9){
                 doubleSum += x;
            }else   singleSum += x;
        }
        if(singleSum != doubleSum)  return true;
        return false;        
    }
}