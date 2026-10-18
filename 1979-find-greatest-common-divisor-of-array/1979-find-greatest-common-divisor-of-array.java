class Solution {

    public int gcd(int a, int b){
        while(a != 0){
            int c = b%a;
            b = a;
            a = c;
        }
        return b;
    }
    public int findGCD(int[] nums) {

        int small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;

        for(int x : nums){
            if(x > large){
                large = x;
            }
            if(x < small){
                small = x;
            }
        }

        return gcd(small, large);        
    }
}