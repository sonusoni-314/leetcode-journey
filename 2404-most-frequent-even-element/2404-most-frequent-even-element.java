class Solution {
    public int mostFrequentEven(int[] nums) {

        int n = nums.length;
        HashMap <Integer, Integer> map = new HashMap<>();

        for(int x : nums){
            if(x %2 == 0){
                map.put(x, map.getOrDefault(x, 0) +1);
            }
        }

        int ans = -1;
        int max = 0;

        for(int x : map.keySet()){
            if(map.get(x) > max){
                ans = x;
                max = map.get(x);
            }
            else if(map.get(ans) == map.get(x) && x<ans){
                ans = x;
            }
        }
        return ans;        
    }
}