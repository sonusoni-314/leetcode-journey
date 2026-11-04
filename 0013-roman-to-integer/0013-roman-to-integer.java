
class Solution {
    public int romanToInt(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int i = 0, sum = 0;

        while(i < s.length()-1) {

            int val = map.get(s.charAt(i));

            if(val < map.get(s.charAt(i+1))){
                sum -= val;
            } 
            else{
                sum += val;
            }

            i++;
        }

        // Add the last character
        sum += map.get(s.charAt(i));

        return sum;
    }
}
