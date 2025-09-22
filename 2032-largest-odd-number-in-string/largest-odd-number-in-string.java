class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();

        for(int i=n-1;i>=0;i--){
            // char temp = num.charAt(i);
            // int temp2 = Character.getNumericValue(temp);
            int d = num.charAt(i) - '0';
            if(d % 2 == 1){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}