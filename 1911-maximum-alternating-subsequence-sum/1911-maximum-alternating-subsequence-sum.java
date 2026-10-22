class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[][] dp = new long[n+1][2];
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i], -1);
        }
        return solve(0, nums, 1, dp);
        
    }

    public long solve(int i, int[] nums, int sign, long[][] dp){

        if(i >= nums.length){
            return 0;
        }

        if(dp[i][sign] != -1){
            return dp[i][sign];
        }

        long skip = solve(i+1, nums, sign, dp);
        long take;
        if(sign == 1){
            take = nums[i] + solve(i+1, nums, 0, dp);
        }else{
            take = -nums[i] + solve(i+1, nums, 1, dp);
        }
        return dp[i][sign] = Math.max(skip, take); 
    }
}