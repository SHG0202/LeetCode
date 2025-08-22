class Solution {
    public String convertToTitle(int n) {
        String[] arr = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String str = "";

        if(n >=1 && n <= 26){
            return arr[(int)n-1];
        }

        while((n-1)/26 > 0){
            int index = (int)((n-1) % 26);
            str = arr[index] + str;
            n = (n-1) / 26;
        }

        str = arr[(int)n-1] + str;
        return str;
    }
}