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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode res = helper(root, val);
        return res;
    }
    public TreeNode helper(TreeNode root,int val ){
        
        //Base case
        if(root == null){
            return new TreeNode(val);
        }
        //recursive call , compare root and val to know the direction to take
        if(root.val > val){ // looking at the left
            TreeNode node = helper(root.left, val); // null, 5
               root.left = node;
            
        }else{
            TreeNode node = helper(root.right, val);
               root.right = node;
           
    }
         return root;
    }

}