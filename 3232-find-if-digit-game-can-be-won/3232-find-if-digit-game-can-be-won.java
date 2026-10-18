class Solution {
    public boolean canAliceWin(int[] nums) {

        int singleSum = 0;
        int doubleSum = 0;
        int digits = 0;

        for(int x : nums){
            digits = (int)Math.log10(x)+1;
            if(digits == 1){
                singleSum += x;
            }else   doubleSum += x;
        }
        if(singleSum != doubleSum)  return true;
        return false;        
    }
}