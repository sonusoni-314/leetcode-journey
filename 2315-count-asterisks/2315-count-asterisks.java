class Solution {
    public int countAsterisks(String s) {

        boolean inside = false;
        int count = 0;

        for(char ch : s.toCharArray()){
            if(ch == '*' && inside == false){
                count++;
            }
            else if(ch == '|'){
                inside = !inside;
            }
        }
        return count;        
    }
}