package CompareVersionNumbers;

public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int maxLen = Math.max(v1.length, v2.length);
        for(int i = 0; i < maxLen; i++){
            Integer number1 = i < v1.length ? Integer.valueOf(v1[i]) : 0;
            Integer number2 = i < v2.length ? Integer.valueOf(v2[i]) : 0;
            if(number1 < number2){
                return -1;
            }
            if(number1 > number2){
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] argv){
        Solution solution = new Solution();
        solution.compareVersion("0.1", "1.1");
    }
}
