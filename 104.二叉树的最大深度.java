import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=104 lang=java
 *
 * [104] 二叉树的最大深度
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        // BFS(广度优先)
        // if (root == null) {
        // return 0;
        // }
        // Queue<TreeNode> queue = new LinkedList<>();
        // queue.add(root);
        // int maxDepth = 0;
        // while (!queue.isEmpty()) {
        // maxDepth++;
        // int len = queue.size();
        // for (int i = 0; i < len; i++) {
        // TreeNode curr = queue.poll();
        // if (curr.left != null) {
        // queue.add(curr.left);
        // }
        // if (curr.right != null) {
        // queue.add(curr.right);
        // }
        // }
        // }
        // return maxDepth;

        // DFS(深度优先)
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
// @lc code=end
