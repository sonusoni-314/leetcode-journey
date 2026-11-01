class Solution {
    public int minMoves(int[] nums) {

        int moves = 0;

        int min = Integer.MAX_VALUE;
        for(int x : nums){
            if(x < min){
                min = x;
            }
        }

        // for(int x : nums){
        //     moves += x - min;
        // }

        int n = nums.length;
        int sum = 0;
        for(int x : nums){
            sum += x;
        }
        moves = sum - n*min;
        return moves;
    }
}