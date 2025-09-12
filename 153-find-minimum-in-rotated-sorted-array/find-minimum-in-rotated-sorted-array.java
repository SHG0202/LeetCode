class Solution {
    public int findMin(int[] nums) {
        int len = nums.length;
        int low = 0;
        int high = len - 1;

        if(nums[low] < nums[high]) return nums[low];

        while(low <= high){
            if(nums[high] >= nums[low]) return nums[low];

            int mid = (low + high) / 2;
            if(nums[mid] >= nums[low]) {
                if(low != mid) low = mid;
                else low = mid + 1;
            }
            else {
                if(high != mid) high = mid;
                else high = mid - 1; 
            }
        }

        return -1;
    }
}