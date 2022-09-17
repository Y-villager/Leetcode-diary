package code.链表;

import java.util.List;

/**
 * 功能描述
 *
 * @author: yxz
 * @date: 2022年09月17日 10:20
 */
public class 链表反转 {
    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public static void main(String[] args) {
        ListNode listNode5 = new ListNode(5, null);
        ListNode listNode4 = new ListNode(4, listNode5);
        ListNode listNode3 = new ListNode(3, listNode4);
        System.out.println((listNode3));
        System.out.println(recursion(listNode3));
    }

    // 1.迭代
    public static ListNode iterate(ListNode head){
        ListNode next, prev=null;
        ListNode curr = head;
        while(curr != null){
            next = curr.next; // 存储下一个链表
            curr.next = prev; // 保存反转列表
            prev = curr;      // 存储当前列表
            curr = next;    // 迭代
        }
        return prev;
    }

    // 2.递归
    public static ListNode recursion(ListNode head){
        if (head==null || head.next==null){
            return head;
        }
        ListNode new_head = recursion(head.next);
        head.next.next = head;
        head.next = null;
        return new_head;
    }

}
