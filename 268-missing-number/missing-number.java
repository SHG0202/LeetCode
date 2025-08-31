class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        // Arrays.sort(nums);
        // for(int i=0;i<len;i++){
        //     if(i != nums[i]) return i;        
        // }
        
        // return len;

        int xor1 = 0;
        int xor2 = 0;

        for(int i=0;i<len;i++){
            xor1 = xor1^nums[i];
            xor2 = xor2^i;
        }
        xor2^=len;

        return xor1^xor2;
    }
}