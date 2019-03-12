package DiameterofBinaryTree;

public class Solution {
    private int distance = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){ return 0; }
        maxDistance(root);
        return distance;
    }

    public int maxDistance(TreeNode root){
        if(root==null) {return 0;}
        int left = maxDistance(root.left);
        int right = maxDistance(root.right);
        if(left+right>distance){
            distance = left+right;
        }
        return Math.max(left,right)+1;
    }
}
