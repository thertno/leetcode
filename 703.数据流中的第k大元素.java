import java.util.PriorityQueue;

/*
 * @lc app=leetcode.cn id=703 lang=java
 *
 * [703] 数据流中的第K大元素
 */

// @lc code=start
class KthLargest {
    private PriorityQueue<Integer> pQueue;
    private int size;

    public KthLargest(int k, int[] nums) {
        size = k;
        pQueue = new PriorityQueue<>(k);
        for (int n : nums) {
            add(n);
        }
    }

    public int add(int val) {
        if (pQueue.size() < size) {
            pQueue.offer(val);
        } else if (pQueue.peek() < val) {
            pQueue.poll();
            pQueue.offer(val);
        }
        return pQueue.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such: KthLargest
 * obj = new KthLargest(k, nums); int param_1 = obj.add(val);
 */
// @lc code=end
