class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max_len = 0;
        int i = 0;
        int j = i;
        String temp = "";
        int len = s.length();

        while(i < len){
            j = i;
            while(j < len){
                if(temp.contains(String.valueOf(s.charAt(j)))){
                    if(temp.length() > max_len){
                        max_len = temp.length();
                    }
                    temp = "";
                    i++;
                    break;
                }else{
                    temp += String.valueOf(s.charAt(j));
                    j++;
                }
            }
            if(temp.length() > max_len){
                max_len = temp.length();
            }
        }
        return max_len;
    }
}