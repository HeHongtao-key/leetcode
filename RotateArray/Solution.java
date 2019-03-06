package RotateArray;

public class Solution {
    public void rotate(int[] nums, int k) {
        int count = k % nums.length;
        while(count-- > 0){
            int temp = nums[nums.length - 1];
            for(int i = nums.length - 1; i >= 1; i--){
                nums[i] = nums[i - 1];
            }
            nums[0] = temp;
        }
    }

    public void rotate_2(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }


    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }


}
