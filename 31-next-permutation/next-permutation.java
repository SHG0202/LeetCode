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
            reverseArrayInPlace(nums, 0, len-1);
            return;
        }

        int min_max = 101;
        int swapIndex = -1;
        for(int i=len-1;i>index;i--){
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

        reverseArrayInPlace(nums,index+1, len-1);
    }

    public void reverseArrayInPlace(int[] arr, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }
}