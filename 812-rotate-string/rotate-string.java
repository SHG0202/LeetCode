class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        int count = 1;
        int len = s.length();

        while(count <= s.length()){
            if(s.equals(goal)) return true;
            s = String.valueOf(s.charAt(len-1)) + s.substring(0,len-1);
            count++;
        }

        return false;
    }
}