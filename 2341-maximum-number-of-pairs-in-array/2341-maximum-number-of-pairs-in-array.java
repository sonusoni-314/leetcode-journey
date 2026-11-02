class Solution {
    public int[] numberOfPairs(int[] nums) {

        int n = nums.length;
        int pairs = 0;
        int left = 0;
        int[] arr = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int x : nums){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for(int x : map.keySet()){
            while(map.get(x) >= 2){
                pairs++;
                map.put(x, map.get(x) - 2);
            }
        }

        left = n - 2 * pairs;

        arr[0] = pairs;
        arr[1] = left;

        return arr;
    }
}