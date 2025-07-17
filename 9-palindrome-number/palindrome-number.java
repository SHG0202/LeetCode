class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }

        if(x == 0){
            return true;
        }

        int y = x;
        int new_num = 0;
        while(y>0){
            int temp = y%10;
            y /= 10;
            new_num *= 10;
            new_num += temp;
        }

        return (new_num == x);
    }
}