class Solution {
    public boolean isValid(String word) {
        if(word.length()<3){ return false;}
        boolean hasVovel = false;
        boolean hasConsonant = false;

        for(int i=0;i<word.length();i++){
            if((word.charAt(i) >= 97 && word.charAt(i) <= 122) || 
            (word.charAt(i) >= 65 && word.charAt(i) <= 90) || 
            (word.charAt(i) >= 48 && word.charAt(i) <= 57)){
                if(word.charAt(i) == 65 || word.charAt(i) == 69 || word.charAt(i) == 73 || 
                word.charAt(i) == 79 || word.charAt(i) == 85 || word.charAt(i) == 97 || 
                word.charAt(i) == 101 || word.charAt(i) == 105 || word.charAt(i) == 111 || word.charAt(i) == 117) {
                    hasVovel = true;
                }
                else if(!(word.charAt(i) >= 48 && word.charAt(i) <= 57)){
                    hasConsonant = true;
                }
            }else{
                return false;
            }          
        }
        if(hasVovel && hasConsonant){ return true;} 
        return false;
    }
}