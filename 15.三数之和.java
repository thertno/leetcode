import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=15 lang=java
 *
 * [15] 三数之和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(final int[] nums) {
        // List<List<Integer>> list = new ArrayList<>();
        // int len = nums.length;
        // if (len < 3) {
        // return new ArrayList<>();
        // }
        // Arrays.sort(nums);
        // for (int i = 0; i < len; i++) {
        // if (nums[i] > 0) {
        // break;
        // }
        // if (i > 0 && nums[i] == nums[i - 1])
        // continue;
        // int left = i + 1;
        // int right = len - 1;
        // while (left < right) {
        // int sum = nums[i] + nums[left] + nums[right];
        // if (sum < 0) {
        // left++;
        // }
        // if (sum > 0) {
        // right--;
        // }
        // if (sum == 0) {
        // list.add(Arrays.asList(nums[i], nums[left], nums[right]));
        // while (left < right && nums[left] == nums[left + 1]) {
        // left++;
        // }
        // while (left < right && nums[right] == nums[right - 1]) {
        // right--;
        // }
        // left++;
        // right--;
        // }
        // }
        // }
        // return list;

        // a+b+c=0 a=-(b+c) 两层循环
        if (nums.length < 3) {
            return new ArrayList<>();
        }
        Set<List<Integer>> list = new HashSet();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i >= 1 && nums[i] == nums[i - 1]) {
                continue;
            }
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = i + 1; j < nums.length; j++) {
                int temp = -nums[i] - nums[j];
                if (map.containsKey(nums[j])) {
                    List<Integer> result = new ArrayList<>();
                    result.add(temp);
                    result.add(nums[i]);
                    result.add(nums[j]);
                    list.add(result);
                } else {
                    map.put(temp, 1);
                }
            }
        }
        return new ArrayList<>(list);
    }
}
// @lc code=end
