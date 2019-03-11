package ThirdMaximumNumber;

public class Solution {
    public int thirdMax(int[] nums) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        boolean flag = false;
        for(int number: nums){
            if(number == Integer.MIN_VALUE){
                flag = true;
            }
            if(number > firstMax){
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = number;
            }else if(number < firstMax && number > secondMax){
                thirdMax = secondMax;
                secondMax = number;
            }else if(number < secondMax && number > thirdMax){
                thirdMax = number;
            }
        }

        if(flag){
            if(secondMax != Integer.MIN_VALUE)
                return thirdMax;
        }else {
            if(thirdMax != Integer.MIN_VALUE) {
                return thirdMax;
            }
        }
        return firstMax;
    }

    public static void main(String[] argv){
        Solution solution = new Solution();
        solution.thirdMax(new int[]{1,2});
    }
}
