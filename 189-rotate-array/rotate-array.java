class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k%len;
        int[] temp = new int[len];

        for(int i=0;i<len;i++){
            temp[i] = nums[i];
        }

        for(int i=0;i<len;i++){
            if(i+k < len){
                nums[i+k] = temp[i];
            }else{
                nums[i+k-len] = temp[i];
            }
        }
    }
}