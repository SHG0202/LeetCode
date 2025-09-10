class Solution {
    public int maxProduct(int[] nums) {
        int pre = 1;
        int suf = 1;
        int len = nums.length;

        int ans = Integer.MIN_VALUE;

        for(int i=0;i<len;i++){
            if(pre == 0) pre = 1;
            if(suf == 0) suf = 1;

            pre *= nums[i];
            suf *= nums[len-i-1];

            ans = Math.max(ans, Math.max(pre, suf));
        }

        return ans;
    }
}