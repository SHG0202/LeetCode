class Solution {
    public int[] rearrangeArray(int[] nums) {
        int len = nums.length;
        int i1 = 0;
        int[] res = new int[len];
        int i2 = 0;
        int j2 = 1;

        // while(i<len && j<len){
        //     if(nums[i] > 0) i+=2;
        //     else{
        //         int t = i;
        //         while(nums[t] < 0) t++;
        //         int temp = nums[i];
        //         nums[i] = nums[t];
        //         nums[t] = temp;
        //     }
            
        //     if(nums[j] < 0) j+=2;
        //     else{
        //         int t = j;
        //         while(nums[t] > 0) t++;
        //         int temp = nums[i];
        //         nums[i] = nums[t];
        //         nums[t] = temp;
        //     }
            
        // }

        for(int n : nums){
            if(n > 0) {
                res[i2] = n;
                i2 += 2;
            }
            if(n < 0) {
                res[j2] = n;
                j2 += 2;
            }
        }

        return res;
    }
}