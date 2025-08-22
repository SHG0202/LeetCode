class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String reverseWord = "";

        for(int i=words.length-1;i>=0;i--){
            if(!words[i].equals("")){
                if(reverseWord != ""){
                    reverseWord += " ";
                }
                reverseWord += words[i];
            }
        }
        return reverseWord;
    }
}