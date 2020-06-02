import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=51 lang=java
 *
 * [51] N皇后
 */

// @lc code=start
class Solution {
    private static int max = 4;
    private static int[] array;
    List<List<String>> list=new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        max = n;
        array = new int[max];
        new Solution().check(0);
        return list;
    }

    private void check(int n) {
        if (n == max) {
            print();
            return;
        }
        for (int i = 0; i < array.length; i++) {
            array[n] = i;
            if (judge(n)) {
                check(n + 1);
            }
        }
    }

    private boolean judge(int n) {
        for (int i = 0; i < n; i++) {
            if (array[i] == array[n] || Math.abs(n - i) == Math.abs(array[n] - array[i])) {
                return false;
            }
        }
        return true;
    }

    /**
     * 打印棋盘
     */
    private void print() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j == array[j]) {
                    System.out.print(" G");
                } else {
                    System.out.print(" .");
                }
            }
            System.out.println();
        }
    }
}
// @lc code=end
