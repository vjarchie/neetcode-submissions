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
    int maxDiameter = Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        int compute = heightUtil(root);
        return maxDiameter;
    }

    public int heightUtil(TreeNode root){
        if(root==null){
            return 0;
        }
        int lh = heightUtil(root.left);
        int rh = heightUtil(root.right);
        maxDiameter = Math.max(lh+rh, maxDiameter);

        return 1+Math.max(lh,rh);
    }

}
