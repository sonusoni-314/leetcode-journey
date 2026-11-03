class Solution {
    public int minMoves(int[] nums) {

        int max = Integer.MIN_VALUE;
        for(int x : nums){
            if(x > max){
                max = x;
            }
        }

        int count = 0;
        for(int x : nums){
            count += Math.abs(x - max);
        }
        return count;
    }
}