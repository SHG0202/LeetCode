class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int a = 0;
        int b = 1;
        int c = 2;

        int min_sum = nums[a] + nums[b] + nums[c];

        for(a=0;a<nums.length-2;a++){
            for(b=a+1;b<nums.length-1;b++){
                for(c=b+1;c<nums.length;c++){
                    int temp_sum = nums[a] + nums[b] + nums[c];
                    if(Math.abs(target - temp_sum) < Math.abs(target - min_sum)){
                        min_sum = temp_sum;
                    }
                    if(min_sum == target) { return target;}
                }
            }
        }

        return min_sum;
    }
}