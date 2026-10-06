class Solution {
    public int countConsistentStrings(String allowed, String[] words) {

        HashSet <Character> set = new HashSet <>();
        int count = 0;
        boolean okay = false;

        for(char ch : allowed.toCharArray()){
            set.add(ch);
        }

        for(int i=0; i<words.length; i++){
            okay = false;
            for(char ch : words[i].toCharArray()){
                if(set.contains(ch)){
                    okay = true;
                }else{
                    okay = false;
                    break;
                }
            }
            if(okay == true){
                count++;
            }
        }
        return count;
    }
}