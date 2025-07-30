class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1){
            return strs[0];
        }

        int min_length = strs[0].length();
        String key = strs[0];
        for(String s : strs){
            if(s.length() < min_length){
                min_length = s.length();
                key = s;
            }
        }

        int i = 1;

        while(i <= min_length){
            for (String str : strs){
                if(!str.substring(0,i).equals(key.substring(0,i))){
                    return key.substring(0,i-1);
                }
            }
            i++;
        }
        
        return key;
    }
}