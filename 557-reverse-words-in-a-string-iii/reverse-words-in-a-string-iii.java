class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String reverseWord = "";

        for(int i=0;i<=words.length-1;i++){
            if(!words[i].equals("")){
                if(reverseWord != ""){
                    reverseWord += " ";
                }
                StringBuilder sb = new StringBuilder(words[i]);
                String reversedString = sb.reverse().toString();
                reverseWord += reversedString;
            }
        }
        return reverseWord;
    }
}