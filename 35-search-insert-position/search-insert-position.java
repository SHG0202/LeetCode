class Solution {
    public int searchInsert(int[] nums, int target) {
        int lower = 0;
        int upper = nums.length - 1;
        int result = nums.length;

        while(lower <= upper){
            int mid = (lower + upper) / 2;

            if(nums[mid] >= target) {
                result = mid;
                upper = mid-1;
            }else{
                lower = mid+1;
            }
        }

        return result;
    }
}