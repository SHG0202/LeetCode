class Solution {
    public int mySqrt(int x) {
        int low = 0;
        int high = x;
        int result = 0;

        while(low <= high){
            int mid = (low + high) / 2;

            if((long)mid*mid == x) return mid;
            else if((long) mid * mid > x) high = mid-1;
            else {
                result = mid;
                low = mid+1;
            }
        }

        return result;
    }
}