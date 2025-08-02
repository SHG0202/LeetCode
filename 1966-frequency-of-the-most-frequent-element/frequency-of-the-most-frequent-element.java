class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int max_freq = 0;
        long total = 0;
        int left = 0;

        for (int right = 0;right<nums.length;right++){
            total += nums[right];
            long windowSize = right-left+1;
            long targetSum = (long) nums[right] * windowSize;
            while(targetSum - total > k){
                total -= nums[left];
                left++;
                windowSize = right-left+1;
                targetSum = (long) nums[right] * windowSize;
            }
            max_freq = Math.max(max_freq, (int)windowSize);
        }

        return max_freq;
    }
}