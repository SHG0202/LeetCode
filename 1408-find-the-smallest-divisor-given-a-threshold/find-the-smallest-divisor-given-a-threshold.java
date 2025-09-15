class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int len = nums.length;
        int low = 1;
        int high = -1;

        for(int n : nums){
            high = Math.max(high, n);
        }

        int result = high;

        while(low <= high){
            int mid = (low + high)/2;

            if(getSum(nums, mid) <= threshold) {
                result = Math.min(mid, result);
                high = mid-1;
            }else{
                low = mid+1;
            }
        }

        return result;
    }

    public int getSum(int[] nums, int mid){
        int sum = 0;

        for(int n : nums){
            if(n%mid == 0) sum += n/mid;
            else sum += (n/mid) + 1;
        }

        return sum;
    }
}