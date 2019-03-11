package SymmetricTree;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }else {
            return isSubSymmetric(root.left, root.right);
        }
    }

    public boolean isSubSymmetric(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return true;
        }
        if(p != null && q != null && p.val == q.val){
            return isSubSymmetric(p.left, q.right) && isSubSymmetric(p.right, q.left);
        }else {
            return false;
        }
    }
}
