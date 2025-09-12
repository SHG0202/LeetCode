class Solution {
    public int findPeakElement(int[] nums) {
        int len = nums.length;
        int low = 0;
        int high = len - 1;

        if(len == 1) return 0;

        while(low <= high){
            int mid = (low+high)/2;
            
            if(mid == 0 && nums[mid] > nums[mid+1]) return mid;
            else if(mid == 0) return mid+1;
            if(mid == len-1 && nums[mid] > nums[mid-1]) return mid;
            
            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) return mid;
            
            if(nums[mid] > nums[mid-1] && nums[mid] < nums[mid+1]) low = mid+1;
            else high = mid-1;
        } 

        return len-1;
    }
}