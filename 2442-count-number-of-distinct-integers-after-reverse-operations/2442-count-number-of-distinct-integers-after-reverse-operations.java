class Solution {
    public int reverse(int x){
        int rev = 0;
        while(x != 0){
            int digit = x%10;
            rev = rev*10 + digit;
            x /= 10;
        }
        return rev;
    }
    public int countDistinctIntegers(int[] nums) {

        HashSet <Integer> set = new HashSet <>();
        for(int x : nums){
            set.add(x);
        }
        for(int x : nums){
            set.add(reverse(x));
        }
        return set.size();
    }
}