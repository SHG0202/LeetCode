class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        String reverseWord = "";

        for(int i=words.length-1;i>=0;i--){
            reverseWord += words[i];
            if(i != 0){
                reverseWord += " ";
            }
        }
        return reverseWord.trim();
    }
}