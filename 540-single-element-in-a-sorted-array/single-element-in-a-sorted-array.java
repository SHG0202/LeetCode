class Solution {
    public int singleNonDuplicate(int[] nums) {
        int len = nums.length;

        if(len == 1 || nums[0] != nums[1]) return nums[0];

        // for(int i=0;i<len-1;i+=2){
        //     if((nums[i] ^ nums[i+1]) != 0) return nums[i]; 
        // }

        //return nums[len-1];

        if(nums[len-1] != nums[len-2]) return nums[len-1];

        int low = 1;
        int high = len - 2;

        while(low <= high) {
            int mid = (low + high) / 2;

            if(nums[mid-1] != nums[mid] && nums[mid] != nums[mid+1]) return nums[mid];

            if(nums[mid-1] == nums[mid]){
               if(mid%2 != 0) low = mid+1;
               else high = mid-1;
            }else if(mid < len-1 && nums[mid] == nums[mid+1]){
                if(mid%2 != 0) high = mid-1;
                else low = mid+1;
            }
        }

        return -1;
    }
}