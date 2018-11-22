/*
TASK:
Find out if a linked list contains a cycle.

To solve this problem I am using Floyd's cycle-finding algorithm.
 */
package marzgra.crackingthejobintreview.linkedlistcycle;


public class LinkedListCycle {
    boolean hasCycle(Node head) {
        if (head == null) return false;

        Node slow, fast;
        slow = fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // 1 hop
            fast = fast.next.next;     // 2 hops

            if (slow == fast) return true;
        }
        return false;
    }
}
