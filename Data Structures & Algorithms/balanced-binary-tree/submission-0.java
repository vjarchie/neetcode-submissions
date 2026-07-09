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
    public boolean isBalanced(TreeNode root) {
        int[] height = new int[1];
        return heightUtil(root)[0]==1;
    }

    public int[] heightUtil(TreeNode root){
        if(root == null){
            return new int[]{1,0};
        }
        
        int[] left =  heightUtil(root.left);
        int[] right = heightUtil(root.right);
        boolean bal = (left[0]== 1 && right[0]==1 && Math.abs(left[1]-right[1])<=1);
        int height = Math.max(left[1],right[1])+1;
        return new int[]{bal?1:0,height};
    }
}
