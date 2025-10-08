class Solution {
    public int beautySum(String s) {
        int total_count = 0;

        for(int i=0; i<s.length(); i++){
            Map<Character, Integer> count = new HashMap<>();

            for(int j=i;j<s.length();j++){
                count.put(s.charAt(j), count.getOrDefault(s.charAt(j), 0) + 1); 
                
                int count_min = Integer.MAX_VALUE;
                int count_max = 0;

                for(int val : count.values()){
                    count_max = Math.max(val, count_max);
                    count_min = Math.min(val, count_min);
                }

                total_count += (count_max - count_min);

            }
        }

        return total_count;
    }
}