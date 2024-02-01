package Imu892_2022;

//基于链表的冒泡排序，带头节点
public class BubbleSort {
    //定义的节点类
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    //冒泡排序
    public static ListNode sort(ListNode head) {
        //链表为空，或者只有单结点
        if (head == null || head.next == null) {
            return head;
        }
        // 获取链表长度
        ListNode lengthNode = head;
        int length = 0;
        while (lengthNode != null) {
            length++;
            lengthNode = lengthNode.next;
        }

        ListNode result = null;
        // 循环冒泡排序，控制循环次数
        for (int i = 0; i < length; i++) {
            result = bubbleSort(head);
        }
        return result;
    }

    //单次冒泡
    public static ListNode bubbleSort(ListNode head) {
        ListNode point = head;
        for (; point.next != null; point = point.next) {
            if (point.val > point.next.val) {
                int temp = point.val;
                point.val = point.next.val;
                point.next.val = temp;
            }
        }
        return head;
    }

    //打印链表
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void entrance() {
        //构建链表
        ListNode head = new ListNode(3);
        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(1);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.println("---------排序前-------");
        printList(head);
        System.out.println(" ");
        head = sort(head);
        System.out.println("---------排序后-------");
        printList(head);
    }
}
