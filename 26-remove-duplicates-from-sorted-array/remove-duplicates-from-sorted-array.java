class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int temp = nums[0];
        int count = 1;

        for(int i=1;i<n;i++){
            if(temp != nums[i]){   
                nums[count] = nums[i];       
                temp = nums[i];
                count++;
            }
        }
        return count;
    }
}