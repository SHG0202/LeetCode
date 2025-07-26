class Solution {
    public int reverse(int x) {

        boolean neg = false;
        if(x < 0){ 
            neg = true; 
            x *= -1;
        }

        int num = 0;
        while(x > 0){
            int digit = x%10;
            if(num > Integer.MAX_VALUE/10 || (num == Integer.MAX_VALUE/10 && ((neg == false && digit > 7) || (neg == true && digit > 8)))){
                return 0;
            }
            num = (num*10) + digit;
            x /= 10;
        }

        if(neg == true){
            num *= -1;
        }

        // if(num < low || num > high || num == 1056389759){
        //     return 0;
        // }

        return num;
    }
}