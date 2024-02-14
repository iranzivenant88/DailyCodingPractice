/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        boolean result = helper(root,null,null);
        return result;
        
    }
    public boolean helper(TreeNode root, Integer min , Integer max){
        if(root == null){
            return true;
        }
       // // if(root.left != null && root.left.val && root.left.val<= min > root.val ){
       //      return false;
       //  } else if(root.right != null && root.right.val < root.val){
       //      return false;
       //  }
        if(min != null && min >= root.val ||  max!= null && root.val >= max ){
            return false;
        }
            boolean leftCheck = helper(root.left,min , root.val);
            boolean rightCheck = helper(root.right,root.val, max);
        
        return leftCheck && rightCheck;
    }
}