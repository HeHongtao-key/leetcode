package BinaryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        List<TreeNode> input = new ArrayList<>();
        input.add(root);
        while(input.size() > 0){
            List<TreeNode> output = new ArrayList<>();
            List<Integer> levelResult = new ArrayList<>();
            for(int i = 0;i < input.size(); ++i){
                levelResult.add(input.get(i).val);
                if(input.get(i).left != null){
                    output.add(input.get(i).left);
                }
                if(input.get(i).right != null){
                    output.add(input.get(i).right);
                }
            }
            input = output;
            result.add(levelResult);
        }
        return result;
    }
}
