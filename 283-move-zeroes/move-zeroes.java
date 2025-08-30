class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int left = 0;
        int right = len-1;

        while(right >= 0 && nums[right] == 0){
            right--;
        }

        while(left <= right){
            if(nums[left] == 0){
                shiftLeftByOne(nums, left, right);
                right--;
            }else{
                left++;
            }
        }
    }

    public void shiftLeftByOne(int[] nums, int left, int right){
        for(int i=left+1;i <=right;i++){
            nums[i-1] = nums[i];
        }
        nums[right] = 0;
    }
}