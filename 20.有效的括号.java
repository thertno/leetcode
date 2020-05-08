import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        char[] c = s.toCharArray();
        Map<String, String> map = new HashMap<>();
        map.put(")", "(");
        map.put("}", "{");
        map.put("]", "[");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < c.length; i++) {
            String val = String.valueOf(c[i]);
            if (!map.containsKey(val)) {
                stack.push(val);
            } else if (stack.size() == 0 || !stack.pop().equals(map.get(val))) {
                return false;
            }
        }
        return stack.size() == 0;
    }
}
// @lc code=end
