class Solution {
    public int[] numberOfPairs(int[] nums) {

        HashMap <Integer, Integer> map = new HashMap <>();
        HashSet <Integer> set = new HashSet <>();
        int pair = 0;
        int left = 0;
        int count = 0;
        int[] ans = new int[2];

        for(int x : nums){
            map.put(x, map.getOrDefault(x, 0) +1);
        }

        for(int x : map.keySet()){
            if(map.get(x) %2 == 0){
                pair = map.get(x)/2 + pair;
            }
            else{
                left = map.get(x) -1;
                count++;
                pair += left/2;
            }
        }
        ans[0] = pair;
        ans[1] = count;
        return ans;        
    }
}