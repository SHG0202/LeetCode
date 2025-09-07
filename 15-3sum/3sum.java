class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int len = nums.length;
        

        // if(len == 3){
        //     if((nums[0] + nums[1] + nums[2]) == 0){
        //         List<Integer> temp = new ArrayList<>();
        //         temp.add(nums[0]);
        //         temp.add(nums[1]);
        //         temp.add(nums[2]);
        //         result.add(temp);
        //     }
        //     return result;
        // }

        // int i,j,k;
        // for(i=0;i<len-2;i++){
        //     for(j=i+1;j<len-1;j++){
        //         for(k=j+1;k<len;k++){
        //             List<Integer> temp = new ArrayList<>();
        //             if((nums[i] + nums[j] + nums[k]) == 0){
        //                 temp.add(nums[i]);
        //                 temp.add(nums[j]);
        //                 temp.add(nums[k]);
        //                 Collections.sort(temp);

        //                 //result.add(temp);

        //                 if(!result.contains(temp))
        //                     result.add(temp);
        //             }
        //         }
        //     }
        // }
        // return result;

        Arrays.sort(nums);

        for(int i=0;i<len;i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int j = i+1;
            int k = len-1;

            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum < 0) {
                    j++;
                }else if(sum > 0){
                    k--;
                }else{
                    List<Integer> temp = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
                    result.add(temp);
                    j++;
                    k--;
                    while(j<k && nums[j] == nums[j-1]) j++;
                    while(j<k && nums[k] == nums[k+1]) k--;
                }
            }
        }
        return result;
    }
}