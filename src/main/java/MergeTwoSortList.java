public class MergeTwoSortList {


    public static class ListNode {
        int val; // value
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static boolean isEqually(ListNode l1, ListNode l2) {
        while(l1 != null && l2 != null) {
            if (l1.val != l2.val) {
                return false;
            }
            l1 = l1.next;
            l2 = l2.next;
        }

        if (l1 != null || l2 != null) {
            return false;
        }

        return true;
    }

    public static void testCase(int[] args1, int[] arg2, int[] expected) {
        ListNode list1 = buildListNode(args1);
        ListNode list2 = buildListNode(arg2);
        ListNode expectedListNode = buildListNode(expected);

        ListNode result = mergeTwoLists(list1, list2);

        printListNode(expectedListNode);
        printListNode(result);

        System.out.println("Result: " + ((isEqually(expectedListNode, result)) ? "pass" : "failed"));
    }

    public static ListNode buildListNode(int[] args) {
        ListNode dummy = new ListNode(0);
        ListNode testListNode = dummy;
        for (int i : args) {
            testListNode.next = new ListNode(i);
            testListNode = testListNode.next;
        }
        return dummy.next;
    }

    public static void printListNode(ListNode listNode) {
        System.out.print("ListNode: ");
        while (listNode != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        testCase(
                new int[] {1, 2, 4},
                new int[] {1, 3, 4},
                new int[] {1, 1, 2, 3, 4, 4}
        );

        testCase(
                new int[] {},
                new int[] {1, 3, 4},
                new int[] {1, 3, 4}
        );

        testCase(
                new int[] {},
                new int[] {1},
                new int[] {1}
        );

        testCase(
                new int[] {1, 2, 3},
                new int[] {1, 2, 3, 4},
                new int[] {1, 1, 2, 2, 3, 3, 4}
        );
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while(list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                curr.next = list1;
                list1 = list1.next; //immutable
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        curr.next = (list1 != null) ? list1 : list2;

        return dummy.next;
    }
}
