package ConvertBSTtoGreaterTree;

public class Solution {
    public int preNum = 0;

    //递归写法
    public TreeNode convertBST(TreeNode root) {
        unPreOrder(root);
        return root;
    }

    public void unPreOrder(TreeNode root) {
        if (root == null)
            return;
        unPreOrder(root.right);
        root.val += preNum;
        preNum = root.val;
        unPreOrder(root.left);
    }

    public TreeNode convertBST2(TreeNode root) {
        if(root == null){
            return null;
        }
        convertBST(root.right);
        root.val += preNum;
        preNum = root.val;
        convertBST(root.left);
        return root;
    }
}
