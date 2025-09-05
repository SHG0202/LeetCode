class Solution {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        int index = -1;
        for(int i=len-2;i>=0;i--){
            if(nums[i] < nums[i+1]) {
                index = i;
                break;
            }
        }

        if(index == -1){
            Arrays.sort(nums);
            return;
        }

        int min_max = 101;
        int swapIndex = -1;
        for(int i=index+1;i<len;i++){
            if(nums[i] > nums[index]){
                if(nums[i] < min_max){
                    swapIndex = i;
                    min_max = nums[i];
                }
            }
        }

        int temp = nums[index];
        nums[index] = nums[swapIndex];
        nums[swapIndex] = temp;

        Arrays.sort(nums,index+1, len);
    }
}