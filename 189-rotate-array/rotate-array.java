class Solution {
    public void rotate(int[] nums, int k) {
        // int len = nums.length;
        // k = k%len;
        // int[] temp = new int[len];

        // for(int i=0;i<len;i++){
        //     temp[i] = nums[i];
        // }

        // for(int i=0;i<len;i++){
        //     if(i+k < len){
        //         nums[i+k] = temp[i];
        //     }else{
        //         nums[i+k-len] = temp[i];
        //     }
        // }

        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

     private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}