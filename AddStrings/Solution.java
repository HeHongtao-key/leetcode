package AddStrings;

public class Solution {
    public String addStrings(String num1, String num2) {
        if(num1 == null || num1.length() == 0){
            return num2;
        }
        if(num2 == null || num2.length() == 0){
            return num1;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int flag = 0;
        for(int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0; i--, j--){
            int numOne = (i >= 0) ? (int)num1.charAt(i) - (int)('0') : 0;
            int numTwo = (j >= 0) ?(int)num2.charAt(j) - (int)('0') : 0;
            int wei = numOne + numTwo + flag;
            if(wei >= 10){
                wei -= 10;
                flag = 1;
            }else {
                flag = 0;
            }
            stringBuilder.append(wei);
        }
        if(flag == 1){
            stringBuilder.append(1);
        }
        return stringBuilder.reverse().toString();
    }
}
