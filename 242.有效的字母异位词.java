import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=242 lang=java
 *
 * [242] 有效的字母异位词
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String val = String.valueOf(s.charAt(i));
            map.put(String.valueOf(val), map.getOrDefault(val, 0) + 1);
        }
        Map<String, Integer> map_temp = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            String val = String.valueOf(t.charAt(i));
            map_temp.put(String.valueOf(val), map_temp.getOrDefault(val, 0) + 1);
        }
        return map_temp.equals(map);
    }
}
// @lc code=end
