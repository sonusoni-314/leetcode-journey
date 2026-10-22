class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] tails = new int[n];
        int len = 0;

        for (int num : nums) {
            int i = 0;
            int j = len;

            while (i < j) {
                int mid = i + (j - i) / 2;

                if (tails[mid] < num) {
                    i = mid + 1;
                } else {
                    j = mid;
                }
            }

            tails[i] = num;

            if (i == len) {
                len++;
            }
        }

        return len;
    }
}