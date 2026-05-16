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
    public int rob(TreeNode root) {
        int[] result = pukesh(root);
        return Math.max(result[0], result[1]);
    }

    private int[] pukesh(TreeNode root) {
        if (root == null) {
            return new int[]{0, 0};
        }

        int[] left = pukesh(root.left);
        int[] right = pukesh(root.right);

        int[] current = new int[2];

        current[0] = root.val + left[1] + right[1];
        current[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);

        return current;
    }
}