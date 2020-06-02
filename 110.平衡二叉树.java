/*
 * @lc app=leetcode.cn id=110 lang=java
 *
 * [110] 平衡二叉树
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public class IsBtree {
        boolean isB;
        int depth;

        public IsBtree(boolean isB, int depth) {
            this.isB = isB;
            this.depth = depth;
        }
    }

    public boolean isBalanced(TreeNode root) {
        return returnBtree(root).isB;
    }

    public IsBtree returnBtree(TreeNode root) {
        if (root == null) {
            return new IsBtree(true, 0);
        }
        IsBtree leftBtree = returnBtree(root.left);
        IsBtree rightBtree = returnBtree(root.right);
        if (!leftBtree.isB || !rightBtree.isB) {
            return new IsBtree(false, 0);
        }
        if (Math.abs(leftBtree.depth - rightBtree.depth) > 1) {
            return new IsBtree(false, 0);
        }
        return new IsBtree(true, Math.max(leftBtree.depth, rightBtree.depth) + 1);
    }

}
// @lc code=end
