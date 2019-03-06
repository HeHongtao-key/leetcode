package ContainsDuplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (Integer number : nums) {
            if(set.contains(number)){
                return true;
            }else {
                set.add(number);
            }
        }
        return false;
    }
}
