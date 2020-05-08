import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/*
 * @lc app=leetcode.cn id=239 lang=java
 *
 * [239] 滑动窗口最大值
 */

// @lc code=start
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // PriorityQueue<Integer> pQueue = new PriorityQueue<>(k,
        // Comparator.reverseOrder());
        // List<Integer> arrayList = new ArrayList<>(k);
        // for (int i = 0; i < nums.length; i++) {
        // Integer val = nums[i];
        // if (pQueue.size() == k) {
        // pQueue.remove(nums[i - k]);
        // }
        // if (pQueue.size() < k) {
        // pQueue.offer(val);
        // } else if (pQueue.peek() < val) {
        // pQueue.poll();
        // pQueue.offer(val);
        // }
        // if (pQueue.size() == k) {
        // arrayList.add(pQueue.peek());
        // }
        // }
        // int[] result = new int[arrayList.size()];
        // for (int i = 0; i < arrayList.size(); i++) {
        // result[i] = arrayList.get(i);
        // }
        // return result;
        if (nums.length == 0) {
            return new int[0];
        }
        List<Integer> windws = new ArrayList<>(k);
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i >= k && windws.get(0) <= i - k) {
                windws.remove(windws.get(0));
            }
            Iterator<Integer> iterator = windws.iterator();
            while (iterator.hasNext()) {
                if (nums[iterator.next()] < nums[i]) {
                    iterator.remove();
                }
            }
            windws.add(i);
            if (i >= k - 1) {
                res.add(nums[windws.get(0)]);
            }
        }
        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
    }
}
// @lc code=end
