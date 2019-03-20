package LongestPalindrome;

import java.util.HashMap;

public class Solution {
    public int longestPalindrome(String s) {
        if(s == null){return 0;}
        HashMap<String, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            String str = s.substring(i, i+1);
            if(hashMap.containsKey(str)){
                hashMap.put(str, hashMap.get(str) + 1);
            }else {
                hashMap.put(str, 1);
            }
        }
        int result = 0;
        for(String str: hashMap.keySet()){
            int count = hashMap.get(str);
            result += (count % 2 == 0) ? count : count - 1;
        }

        return (result < s.length()) ? result+1 : result;
    }

    public static void main(String[] argv){
        Solution solution = new Solution();
        int longest = solution.longestPalindrome("abccccdd");
        System.out.print(longest);
    }
}
