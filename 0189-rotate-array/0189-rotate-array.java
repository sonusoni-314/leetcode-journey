class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] temp = new int[n];
        int j = 0;
        k = k%n;

        for(int i=n-k; i<n; i++){
            temp[j++] = nums[i];
        }
        for(int i=0; i<=n-k-1; i++){
            temp[j++] = nums[i];
        }
        int i=0;
        for(int x:temp){
            nums[i++] = x;
        }
        return;
    }
}