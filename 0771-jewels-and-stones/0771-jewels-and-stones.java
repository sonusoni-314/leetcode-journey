class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        // from stones we have to check, how many stones we have which are also jewel

        // jewels = a, A
        // stones = a -- jewel, A -- jewel, A -- jewel, b -- only stone etc

        HashSet <Character> set = new HashSet <>();
        int count = 0;
        for(char ch : jewels.toCharArray()){
            set.add(ch);
        }

        for(char ch : stones.toCharArray()){
            if(set.contains(ch)){
                count++;
            }
        }
        return count;        
    }
}