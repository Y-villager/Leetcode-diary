package code.链表;

/**
 * 功能描述
 *
 * @author: yxz
 * @date: 2022年09月20日 8:09
 */
public class ListNode {
    public static ListNode listNode5 =  new ListNode(5, null);
    public static ListNode listNode4 =  new ListNode(4, listNode5);
    public static ListNode listNode3 =  new ListNode(3, listNode4);
    int val;
    ListNode next;

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(){
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}

