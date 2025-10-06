class Solution {
    public int maxDepth(String s) {
        int count = 0;
        int max_count = 0;

        for(char c : s.toCharArray()){
            if(c == '(') count++;
            else if(c == ')') count--;

            max_count = Math.max(max_count, count);
        }

        return max_count;
    }
}