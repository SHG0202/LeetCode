class Solution {
    public boolean search(int[] nums, int target) {
        int len = nums.length;
        int low = 0;
        int high = len - 1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(nums[mid] == target) return true;
            if(nums[mid] == nums[high] && nums[mid] == nums[low]) {
                low++;
                high--;
            }
            else if(nums[mid] >= nums[low]){
                if(target <= nums[mid] && target >= nums[low]) high = mid - 1;
                else low = mid + 1;
            }else{
                if(target >= nums[mid] && target <= nums[high]) low = mid + 1;
                else high = mid - 1;
            }
        }

        return false;
    }
}