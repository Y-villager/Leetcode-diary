package code;

import java.util.ArrayList;

/**
 * 功能描述
 *
 * @author: yxz
 * @date: 2022年07月21日 1:51
 */
public class 两数相加 {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 返回结果
        ListNode node = null;
        // 定义一个可移动的指针
        ListNode pre = null;
        // 是否进位，因为最多只能进1，所以值只能是 0 或 1
        int carry = 0;
        while (l1 != null || l2 != null) {
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            int sum = n1 + n2 + carry;
            carry = sum / 10;
            if (sum >= 10){
                sum -= 10;
            }
            // 保存结果
            if (node == null) {
                node = pre = new ListNode(sum);
            } else {
                pre.next = new ListNode(sum);
                pre = pre.next;
            }
            // 循环条件
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            // 最后的相加如果有进位，而没有
            if ((l1 == null || l2 == null) && carry == 1) {
                pre.next = new ListNode(carry);
            }
        }
        return node;
    }

    public static void main(String[] args) {
        int[] node1 = {9,9,9,9,9,9,9};
        int[] node2 = {9, 9,9,9};
//        int[] node1 = {2, 6, 4};
//        int[] node2 = {3, 4, 5};

//        ListNode listnode1 = addNode1(node1);
//        ListNode listnode2 = addNode1(node2);
        ListNode listnode1 = addNode2(node1);
        ListNode listnode2 = addNode2(node2);
        System.out.println(listnode1.toString());
        System.out.println(listnode2);

        System.out.println(addTwoNumbers(listnode1, listnode2));
    }

    // 添加节点方法二
    // 数组正序添加节点，通过new新建next属性的方式添加节点
    private static ListNode addNode2(int[] nums) {
        // 返回结果
        ListNode node = null;
        // 定义一个可移动的指针
        ListNode pre = null;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (node == null) {
                node = pre = new ListNode(nums[i]);
            } else {
                // pre引用node对象，通过pre移动创建node对象中next的ListNode
                pre.next = new ListNode(nums[i]);
                pre = pre.next;
            }
        }
        return node;
    }

    // 添加节点方法一
    // 数组从后往前添加节点
    public static ListNode addNode1(int[] nums) {
        ListNode next = new ListNode();
        ListNode node = null;
        int len1 = nums.length;
        for (int i = len1 - 1; i >= 0; i--) {
            if (i == len1 - 1) {
                node = new ListNode(nums[i]);
            } else {
                node = new ListNode(nums[i], next);
            }
            next = node;
        }
        return node;
    }


}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        ListNode pre = next;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(val);
        while (pre != null){
            list.add(pre.val);
            pre = pre.next;
        }

        return list.toString();
    }
}

