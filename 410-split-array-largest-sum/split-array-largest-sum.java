class Solution {
    public int splitArray(int[] nums, int k) {
        int len = nums.length;

        int low = 0;
        int high = 0;
        for(int n : nums){
            low = Math.max(low, n);
            high += n;
        }

        if(nums.length == k) return low;
        if(low == 0 && high == 0) return 0;

        while(low <= high){
            int mid = (low+high)/2;
            if(isPossible(nums, k, mid)) high = mid - 1;
            else low = mid + 1;
        }

        return low;
    }

    public boolean isPossible(int[] nums, int k, int mid) {
        int len = nums.length;
        int sum = 0;

        for(int i=0;i<len;i++){
            sum += nums[i];
            if(sum > mid) {
                k--;
                sum = nums[i];
            }else if(sum == mid) {
                k--;
                sum = 0;
            }
        }
        
        if(sum > mid) return false;
        if(sum > 0 && sum <= mid) k--;
        if(k >= 0) return true;

        return false;
    }
}