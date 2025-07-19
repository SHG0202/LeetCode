class Solution {
    public String convert(String s, int numRows) {
        int len = s.length();
        String[] temp = new String[numRows];

        for(int i=0;i<numRows;i++){
            temp[i] = "";
        }
        
        if(len == 1 || len <= numRows || numRows == 1){
            return s;
        }

        boolean down = true;
        int i = 0;
        int j = 0;

        while (i < len){
            temp[j] += String.valueOf(s.charAt(i));
            i++;

            if(down == true && j < numRows-1){
                j++;
                down = true;
            }else if(down == false && j > 0){
                j--;
                down = false;
            }else if(down == true && j == numRows-1){
                down = false;
                j--;
            }else if(down == false && j == 0){
                down = true;
                j++;
            }
        }

        String result = "";
        for(String str : temp){
            result += str;
        }

        return result;
    }
}