class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        int len = nums.length;
        if(len == 1) { return nums[0]; }

        for (int i : nums){ set.add(i); }

        int sum = 0;
        for (int i : set){
            if(i > 0){ sum += i;}
        }

        if(sum == 0){
            return Collections.max(set);
        }
        return sum;
    }
}