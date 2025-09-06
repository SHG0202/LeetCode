class Solution {
    public int subarraySum(int[] nums, int k) {
        int len = nums.length;
        // int i=0;
        // int j=0;
        // int sum = 0;
        // int count = 0;

        // if(len == 1) {
        //     if(nums[0] == k) return 1;
        //     else return 0;
        // }

        // while(j < len){
        //     sum += nums[j];
        //     if(sum == k) {
        //         count++;
        //         j++;
        //         sum -= nums[i];
        //         i++;
        //     }else if(sum < k){
        //         j++;
        //     }else{
        //         sum -= nums[i];
        //         i++;
        //         sum -= nums[j];
        //     }
        // }

        // return count;

        Map<Integer, Integer> sumMap = new HashMap<>();
        int sum = 0;
        int count = 0;
        sumMap.put(0,1);

        for(int i=0;i<len;i++){
            sum += nums[i];
            int rem = sum-k;

            if(sumMap.containsKey(rem)){
                count += sumMap.get(rem);
            }
            if(sumMap.containsKey(sum)){
                sumMap.put(sum, sumMap.get(sum) + 1);
            }else{
                sumMap.put(sum, 1);
            }           
            // if(sum == k){
            //     count++;
            // }
        }

        return count;
    }
}