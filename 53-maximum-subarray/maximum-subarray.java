class Solution {

    public int maxSubArray(int[] nums) {
        // int maxSum = Integer.MIN_VALUE;
        // int len = nums.length;

        // for(int i=0;i<len;i++){
        //     for(int j=i;j<len;j++){
        //         int sum = 0;
        //         for(int k=i;k<=j;k++){
        //             sum += nums[k];
        //         }
        //         maxSum = maxSum > sum ? maxSum : sum;
        //     }   
        // }

        // return maxSum;

        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int len = nums.length;

        for(int i=0;i<len;i++){
            sum += nums[i];
            maxSum = maxSum > sum ? maxSum : sum;
            if(sum < 0) sum = 0;
        }

        return maxSum;

    }
}