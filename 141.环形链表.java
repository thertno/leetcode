import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=141 lang=java
 *
 * [141] 环形链表
 */

// @lc code=start
/**
 * Definition for singly-linked list. class ListNode { int val; ListNode next;
 * ListNode(int x) { val = x; next = null; } }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // ListNode fast = head;
        // ListNode slow = head;
        // while (fast != null && slow != null && fast.next != null) {
        // fast = fast.next.next;
        // slow = slow.next;
        // if (fast == slow) {
        // return true;
        // }
        // }
        // return false;
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) {
                return true;
            }
            set.add(head);
            head = head.next;
        }
        return false;
    }
}
// @lc code=end
