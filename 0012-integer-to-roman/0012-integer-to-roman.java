class Solution {
    public String intToRoman(int num) {
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String result = "";
        for(int i=0;i<values.length;i++){
            while(num>=values[i]){
                result = result + value(values[i]);
                num = num - values[i];
            }
        }
        return result;
    }
    public String value(int i){
        switch(i){
            case 1: return "I";
            case 4: return "IV";
            case 5: return "V";
            case 9: return "IX";
            case 10: return "X";
            case 40: return "XL";
            case 50: return "L";
            case 90: return "XC";
            case 100: return "C";
            case 400: return "CD";
            case 500: return "D";
            case 900: return "CM";
            case 1000: return "M";
        }
        return "";
    }
}