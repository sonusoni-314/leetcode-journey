class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+1];
        Arrays.fill(dp, -1);
        return Math.min(solve(0, dp, cost), solve(1, dp, cost));        
    }

    public int solve(int i, int[] dp, int[] cost){
        int n = cost.length;
        if(i >= n){
            return 0;
        }

        if(dp[i] != -1) return dp[i];

        int a = cost[i] + solve(i+1, dp, cost);
        int b = cost[i] + solve(i+2, dp, cost);
        
        dp[i] = Math.min(a, b);
        return dp[i];
    }
}