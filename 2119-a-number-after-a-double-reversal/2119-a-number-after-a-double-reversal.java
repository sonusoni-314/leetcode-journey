class Solution {

    public int reverse(int x){
        int rev = 0;
        while(x != 0){
            int digit = x%10;
            rev = rev*10+digit;
            x /= 10;
        }
        return rev;
    }

    public boolean isSameAfterReversals(int num) {
        
        int x = reverse(num);
        int y = reverse(x);
        if(y == num){
            return true;
        }
        return false;
    }
}