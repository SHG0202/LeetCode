class Solution {
    public String longestCommonPrefix(String[] strs) {
        // if(strs.length == 1){
        //     return strs[0];
        // }

        // int min_length = strs[0].length();
        // String key = strs[0];
        // for(String s : strs){
        //     if(s.length() < min_length){
        //         min_length = s.length();
        //         key = s;
        //     }
        // }

        // int i = 1;

        // while(i <= min_length){
        //     for (String str : strs){
        //         if(!str.substring(0,i).equals(key.substring(0,i))){
        //             return key.substring(0,i-1);
        //         }
        //     }
        //     i++;
        // }
        
        // return key;

        if (strs == null || strs.length == 0) return "";

        // 1. Find the shortest string
        String minStr = strs[0];
        for (String s : strs) {
            if (s.length() < minStr.length()) {
                minStr = s;
            }
        }

        // 2. Compare only up to minStr.length()
        for (int i = 0; i < minStr.length(); i++) {
            char ch = minStr.charAt(i);
            for (String s : strs) {
                if (s.charAt(i) != ch) {
                    return minStr.substring(0, i); // mismatch found
                }
            }
        }

        return minStr; // whole minStr is a prefix
    }
}