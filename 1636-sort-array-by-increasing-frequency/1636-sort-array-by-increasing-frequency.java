class Solution {
    public int[] frequencySort(int[] nums) {

        HashMap <Integer, Integer> map = new HashMap <>();
        for(int x : nums){
            map.put(x, map.getOrDefault(x, 0) +1);
        }

        ArrayList <Integer> list = new ArrayList <>(map.keySet());
        list.sort( (a,b) -> {
            if(map.get(a) > map.get(b)){
                return 1;
            }else if(map.get(a) < map.get(b)){
                return -1;
            }else if(a > b){
                return -1;
            }else{
                return 1;
            }
        });

        int k = 0;

        for(int x : list){
            int freq = map.get(x);
            for(int i=0; i<freq; i++){
                nums[k++] = x;
            }
        }
        return nums;
    }
}