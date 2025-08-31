class Solution {
    public void sortColors(int[] nums) {
        int countRed = 0;
        int countWhite = 0;
        int countBlue = 0;
        int len = nums.length;

        for(int i=0;i<len;i++){
            if(nums[i] == 0) countRed++;
            if(nums[i] == 1) countWhite++;
            if(nums[i] == 2) countBlue++;
        }

        for(int i=0;i<len;i++){
            if(countRed > 0) {
                nums[i] = 0;
                countRed--;
                continue;
            }
            if(countWhite > 0) {
                nums[i] = 1;
                countWhite--;
                continue;
            }
            if(countBlue > 0){
                nums[i] = 2;
                countBlue--;
                continue;
            }
        }
    }
}