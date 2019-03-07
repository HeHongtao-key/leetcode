package FindtheDifference;

public class Solution {
    public char findTheDifference(String s, String t) {
        char result = t.charAt(0);
        for(int i = 1; i < t.length(); i++){
            result ^= t.charAt(i);
        }

        //s字符串可能为空
        for(int i = 0; i < s.length(); i++){
            result ^= s.charAt(i);
        }
        return result;
    }

    public char findTheDifference2(String s, String t) {
        char result = t.charAt(0);
        for(int i = 0; i < s.length(); ++i){
            result ^= s.charAt(i);
            result ^= t.charAt(i+1);
        }
        return result;
    }

}
