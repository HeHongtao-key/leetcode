package BinaryTreeTilt;

public class Solution {
    private int tilt = 0;
    public int findTilt(TreeNode root) {
        node(root);
        return tilt;
    }

    public int node(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = node(root.left);
        int right = node(root.right);
        tilt +=  Math.abs(left - right);
        return left + right + root.val;
    }
}
