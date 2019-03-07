package SameTree;

public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //逻辑不清晰
        if (p == null) {
            if (q == null) {
                return true;
            } else {
                return false;
            }
        } else {
            if (q == null) {
                return false;
            } else if (p.val != q.val) {
                return false;
            }
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public boolean isSameTree2(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if(p != null && q != null && p.val == q.val){
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }else{
            return false;
        }
    }
}
