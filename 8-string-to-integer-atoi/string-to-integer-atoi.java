class Solution {
    public int myAtoi(String s) {
        s = s.stripLeading();
        int sign = 1;
        long result = 0;
        int start = 0;
        int len = s.length();

        if(len == 0) return 0;

        if(s.charAt(0) == '-' || s.charAt(0) == '+'){
            if(s.charAt(0) == '-') sign = -1;
            else sign = 1;

            start++;
        }

        while(start < len && s.charAt(start) - '0' >= 0 && s.charAt(start) - '0' <= 9){
            result = result*10 + (s.charAt(start) - '0');

            if(sign*result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(sign*result < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            start++;
        }

        return (int) result*sign;
    }
}