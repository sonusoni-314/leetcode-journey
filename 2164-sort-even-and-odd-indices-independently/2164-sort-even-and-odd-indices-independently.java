class Solution {
    public int[] sortEvenOdd(int[] nums) {
        ArrayList <Integer> evenList = new ArrayList<>();
        ArrayList <Integer> oddList = new ArrayList<>();
        ArrayList <Integer> list = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(i%2 == 0){
                evenList.add(nums[i]);
            }
            else{
                oddList.add(nums[i]);
            }
        }

        Collections.sort(evenList);
        Collections.sort(oddList, Collections.reverseOrder());

        int even = 0;
        int odd = 0;

        for(int i=0; i<nums.length; i++){
            if(i %2 == 0){
                nums[i] = evenList.get(even++);
            }
            else{
                nums[i] = oddList.get(odd++);
            }
        }
        return nums;
    }
}