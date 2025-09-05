class Solution {
    public int longestConsecutive(int[] nums) {
        int len = nums.length;
        if(len == 0) return 0;
        int longest = 1;
        HashSet<Integer> num = new HashSet<>();

        for(int n : nums){
            num.add(n);
        }

        for(int n : num){
            if(num.contains(n-1)) continue;
            else{
                int i = n;
                int count = 0;
                while(num.contains(i)){
                    count++;
                    i++;
                }
                if(count > longest) longest = count;
            }
        }
        return longest;
    }
}