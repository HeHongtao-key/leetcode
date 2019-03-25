package NumberofSegmentsinaString;

public class Solution {
    public int countSegments(String s) {
        if(s == null || s.length() == 0){return 0;}
        int count = 0;
        for(int i = 0; i < s.length() - 1; i++){
            if(!isSpace(s.charAt(i)) && isSpace(s.charAt(i + 1))){
                count++;
            }
        }
        return isSpace(s.charAt(s.length() - 1)) ? count : count + 1;
    }

    public boolean isCharacter(char c){
        if(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z'){
            return true;
        }
        return false;
    }

    public boolean isSpace(char c){
        if(c == ' '){
            return true;
        }
        return false;
    }
}
