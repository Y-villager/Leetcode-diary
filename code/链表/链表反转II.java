package code.链表;

/**
 * 功能描述
 *
 * @author: yxz
 * @date: 2022年09月20日 8:09
 */
public class 链表反转II {
    public static void main(String[] args) {
//        reverseBetween(ListNode.listNode3,1,2);
    }
//    public static  ListNode reverseBetween(ListNode head, int left, int right){
//        if (left ==1){
//            return reverseListNode(head);
//        }
//        return null;
//    }

    public static void reverseListNode(ListNode head){
        ListNode prev =null,curr =head;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;   // 不知道反转末尾
            prev = curr;
            curr = next;
        }
    }
}
