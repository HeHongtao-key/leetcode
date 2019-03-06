package MajorityElement;

public class Solution {
    //摩尔投票法
    public int majorityElement(int[] nums) {
        int temp = nums[0];
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(count == 0){
                temp = nums[i];
            }
            if(temp == nums[i]){
                count++;
            }else {
                count--;
            }
        }
        return temp;
    }
}
