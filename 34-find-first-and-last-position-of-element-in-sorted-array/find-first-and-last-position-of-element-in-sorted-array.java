class Solution {
    public int[] searchRange(int[] nums, int target) {
        int lower = 0;
        int upper = nums.length - 1;
        int[] result = {-1, -1};

        while(lower <= upper){
            int mid = (lower + upper) / 2;

            if(nums[mid] >= target) {
                result[0] = mid;
                upper = mid-1;
            }else{
                lower = mid+1;
            }
        }

        if(result[0] == -1 || (result[0] != -1 && nums[result[0]] != target)) {
            result[0] = -1;
            return result;
        }

        lower = 0; 
        upper = nums.length - 1;

        while(lower <= upper){
            int mid = (lower + upper) / 2;

            if(nums[mid] > target) {
                result[1] = mid;
                upper = mid-1;
            }else{
                lower = mid+1;
            }
        }

        if(result[1] == -1) result[1] = nums.length-1;
        else result[1]--;

        return result;
    }
}