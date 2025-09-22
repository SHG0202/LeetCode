class Solution {
    public String removeOuterParentheses(String s) {
        // int len = s.length();
        // int open = 1;
        // String result = "";

        // for(int i=1;i<len;i++){
        //     if(s.charAt(i) == ')') open--;
        //     if(s.charAt(i) == '(') open++;
        //     if(open == 0 || (open == 1 && s.charAt(i) == '(')) continue;
        //     result += String.valueOf(s.charAt(i));
        // }

        // return result;

        StringBuilder result = new StringBuilder();
        int depth = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (depth > 0) {
                    result.append(c);
                }
                depth++;
            } else {
                depth--;
                if (depth > 0) {
                    result.append(c);
                }
            }
        }
        return result.toString();
    }
}