import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=111 lang=java
 *
 * [111] 二叉树的最小深度
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public int minDepth(TreeNode root) {
        // BFS(广度优先)
        // if (root == null) {
        // return 0;
        // }
        // Queue<TreeNode> queue = new LinkedList<>();
        // queue.add(root);
        // int minDepth = 0;
        // while (!queue.isEmpty()) {
        // minDepth++;
        // int len = queue.size();
        // for (int i = 0; i < len; i++) {
        // TreeNode curr = queue.poll();
        // if (curr.left == null && curr.right == null) {
        // return minDepth;
        // }
        // if (curr.left != null) {
        // queue.add(curr.left);
        // }
        // if (curr.right != null) {
        // queue.add(curr.right);
        // }
        // }
        // }
        // return minDepth;

        // DFS(深度优先)
        if (root == null) {
            return 0;
        }
        int minLeft = minDepth(root.left);
        int minRight = minDepth(root.right);
        return (minLeft == 0 || minRight == 0) ? 1 + minLeft + minRight : Math.min(minLeft, minRight) + 1;
    }
}
// @lc code=end
