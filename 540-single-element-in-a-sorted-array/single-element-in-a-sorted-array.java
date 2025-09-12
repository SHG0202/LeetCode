class Solution {
    public int singleNonDuplicate(int[] nums) {
        int len = nums.length;

        if(len == 1 || nums[0] != nums[1]) return nums[0];

        for(int i=0;i<len-1;i+=2){
            if((nums[i] ^ nums[i+1]) != 0) return nums[i]; 
        }

        return nums[len-1];
    }
}