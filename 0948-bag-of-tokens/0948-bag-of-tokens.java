class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {


        int n = tokens.length;
        Arrays.sort(tokens);
        int j = n-1;
        int i = 0;
        int score = 0;
        int max = 0;

        while(i<=j){
            if(power >= tokens[i]){
                score +=1;
                power -= tokens[i];
                i++;
                max = Math.max(max, score);
            }

            else if (score >= 1 && i<j){
                power += tokens[j];
                j--;
                score--;
            }
            else{
                break;
            }
        }
        return max;
    }
}