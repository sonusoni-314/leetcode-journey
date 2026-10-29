class Solution {
    public int[] rearrangeArray(int[] nums) {

        ArrayList <Integer> pos = new ArrayList<>();
        ArrayList <Integer> neg = new ArrayList<>();
        ArrayList <Integer> list = new ArrayList<>();

        for(int x : nums){
            if(x>=0){
                pos.add(x);
            }
            else{
                neg.add(x);
            }
        }

        int p=0;
        int n=0;   

        for(int i=0; i<nums.length; i++){
            if(i%2 == 0){
                nums[i] = pos.get(p++);
            }else{
                nums[i] = neg.get(n++);
            }
        }
        return nums;
    }
}