class Solution {

    public int reverse(int x){

        int rev = 0;
        while(x != 0){
            int rem = x%10;
            rev = rev*10 + rem;
            x/=10;
        }
        return rev;
    }

    public int countDistinctIntegers(int[] nums) {

        ArrayList <Integer> list = new ArrayList<>();
        HashSet <Integer> set = new HashSet <>();

        for(int num : nums){
            list.add(reverse(num));
        }

        for(int num : nums){
            set.add(num);
        }

        for(int num : list){
            set.add(num);
        }

        return set.size();       
    }
}