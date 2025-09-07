class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int len = nums.length;

        for(int num : nums){
            count.put(num, count.getOrDefault(num,0)+1);
        }

        for(int num : count.keySet()){
            if(count.get(num) > len/3) result.add(num);
        }

        return result;
    }
}