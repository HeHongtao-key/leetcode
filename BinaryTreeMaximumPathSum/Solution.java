package BinaryTreeMaximumPathSum;

public class Solution {
    int result = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root == null){
            return 0;
        }
        maxPath(root);
        return result;
    }

    public int maxPath(TreeNode root){
        if(root == null){ return 0;}
        int left = Math.max(maxPath(root.left), 0);
        int right = Math.max(maxPath(root.right), 0);
        if(result < left + right + root.val){
            result = left + right + root.val;
        }
        int max = Math.max(left, right);
        if(max > 0){
            return max + root.val;
        }else {
            return root.val;
        }
    }
}
