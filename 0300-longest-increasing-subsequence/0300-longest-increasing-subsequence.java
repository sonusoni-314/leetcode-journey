class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n+1][n+1];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return solve(0, -1, nums, dp);        
    }

    public int solve(int i, int p, int[] nums, int[][] dp){
        if(i >= nums.length){
            return 0;
        }
        if(dp[i][p+1] != -1){
            return dp[i][p+1];
        }
        int take=0;
        if(p == -1 || nums[i]>nums[p]){
            take = 1 + solve(i+1, i, nums, dp);
        }
        
        int skip = solve(i+1, p, nums, dp);
        return dp[i][p+1] = Math.max(take, skip);
    }
}