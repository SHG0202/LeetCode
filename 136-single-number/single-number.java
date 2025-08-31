class Solution {
    public int singleNumber(int[] nums) {
        int len = nums.length;
        int xor = 0;
        for(int i=0;i<len;i++){
            xor = xor ^ nums[i];
        }

        return xor;
    }
}