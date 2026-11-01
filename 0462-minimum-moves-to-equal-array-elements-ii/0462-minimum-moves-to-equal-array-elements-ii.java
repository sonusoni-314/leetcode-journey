class Solution {
    public int minMoves2(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;
        int median = nums[n / 2];

        long moves = 0;

        for(int x : nums) {
            moves += Math.abs((long)x - median);
        }

        return (int)moves;
    }
}