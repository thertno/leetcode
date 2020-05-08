import java.util.List;

/*
 * @lc app=leetcode.cn id=22 lang=java
 *˜
 * [22] 括号生成
 */

// @lc code=start
class Solution {
    
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList();
        generate("", list, n, n);
        return list;
    }

    /**
     * dfs 深度优先
     * @param sublist
     * @param result
     * @param left
     * @param right
     */
    private void generate(String sublist, List<String> result, int left, int right) {
        if (left == 0 && right == 0) {
            result.add(sublist);
            return;
        }
        if (left > 0) {
            generate(sublist + "(", result, left - 1, right);
        }
        if (right > left) {
            generate(sublist + ")", result, left, right - 1);
        }
    }
}
// @lc code=end
