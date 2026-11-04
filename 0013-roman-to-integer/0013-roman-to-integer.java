// here use switch case becos its faster thasn hashmap
//  Java internally needs to:
// 1. Calculate the hash of X.
// 2. Find the appropriate bucket.
// 3. Locate the key.
// 4. Return its value.

// in switch case it directly return its value without any loopkup and calcution overhead

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

        while(i < s.length()) {

            int val = map.get(s.charAt(i));

            if(i+1 < s.length() && val < map.get(s.charAt(i+1))){
                sum -= val;
            } 
            else{
                sum += val;
            }
            i++;
        }
        return sum;
    }
}


