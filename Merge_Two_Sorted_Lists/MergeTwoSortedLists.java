package Merge_Two_Sorted_Lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head = new ListNode(0);
        ListNode current = head;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                System.out.println("list1: " + list1);
                current.next = list1;
                list1 = list1.next;
            } else {
                System.out.println("list2: " + list2);
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if(list1 != null ){
            current.next = list1;
        }else{
            current.next = list2;
        }

        return head.next;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode node = mergeTwoLists(list1, list2);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
