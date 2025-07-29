class Solution {
    public String intToRoman(int num) {
        String roman = "";

        while(num >= 1000){
            roman += "M";
            num -= 1000;
        }
        System.out.println(roman);
        if(num >= 500){
            if(num >= 900) {
                roman += "CM";
                num -= 900; 
            }else{
                roman += "D";
                num -= 500;
            }
        }
        System.out.println(roman);
        while(num >= 100){
            if(num >= 400){
                roman += "CD";
                num -= 400;
                break;
            }
            roman += "C";
            num -= 100;
        }
        System.out.println(roman);
        if(num >= 50){
            if(num >= 90){
                roman += "XC";
                num -= 90;
            }else{
                roman += "L";
                num -= 50;
            }
        }
        System.out.println(roman);
        while(num >= 10){
            if(num >= 40){
                roman += "XL";
                num -= 40;
                break;
            }
            roman += "X";
            num -= 10;
        }
        System.out.println(roman);
        if(num >= 5){
            if(num == 9){
                roman += "IX";
                num -= 9;
                return roman;
            }else{
                roman += "V";
                num -= 5;
            }
        }
        System.out.println(roman);
        while(num >= 1){
            if(num == 4){
                roman += "IV";
                num -= 4;
                return roman;
            }
            roman += "I";
            num -= 1;
        }
        System.out.println(roman);

        return roman;
    }
}