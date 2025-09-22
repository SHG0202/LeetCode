class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> iso_s = new HashMap<>();
        Map<Character, Character> iso_t = new HashMap<>();

        if(s.length() != t.length()) return false;

        for(int i=0;i<s.length();i++){
            if(iso_s.containsKey(s.charAt(i)) && iso_t.containsKey(t.charAt(i))) {
                if(iso_s.get(s.charAt(i)) == t.charAt(i) && iso_t.get(t.charAt(i)) == s.charAt(i)) continue;
                else return false;
            }else if(iso_s.containsKey(s.charAt(i)) || iso_t.containsKey(t.charAt(i))){
                return false;
            }
            else{
                iso_s.put(s.charAt(i), t.charAt(i));
                iso_t.put(t.charAt(i), s.charAt(i));
            }
        }

        return true;
    }
}