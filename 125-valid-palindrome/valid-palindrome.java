class Solution {
    public boolean isPalindrome(String s) {
        String temp = "";
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);        
            if (c >= 65 && c <= 90){
                c += 32;
            }
            if((c >= 97 && c <= 122) || (c >= 48 && c <= 57)){
                temp += String.valueOf(c);
            }
        }

        int len = temp.length();
        int i = 0; int j = len-1;
        while(i <= j){
            if(temp.charAt(i) != temp.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}