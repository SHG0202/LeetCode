class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int n : nums){
            if(!freq.containsKey(n)) freq.put(n, 1);
            else freq.put(n, freq.get(n)+1);
        }

        int max = 0;
        int num = -1;

        for(int key : freq.keySet()){
            if(freq.get(key) > max){
                max = freq.get(key);
                num = key;
            }
        }

        return num;
    }
}