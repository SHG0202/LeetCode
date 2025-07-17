class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);

        int len = s.length();
        int i = len-1;
        int sum = 0;
        char temp1, temp2;
        
        while(i >= 0){
            temp1 = s.charAt(i);
            if(i > 0){
                temp2 = s.charAt(i-1);
            }else{
                sum += roman.get(temp1);
                return sum;
            }
                
            if(roman.get(temp1) <= roman.get(temp2)){
                sum += roman.get(temp1);
            }else{
                sum += (roman.get(temp1) - roman.get(temp2));
                i--;
            }
            i--;
        }
        return sum;
    }
}