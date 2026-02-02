import java.util.List;

public class AddTwoNumbers {


    public static void main(String[] args) {
        ListNode l1 = createList(new int[]{9,9,9,9,9,9,9});
        ListNode l2 = createList(new int[]{9,9,9,9});
        System.out.print("Result: ");
        printList(addTwoNumbers(l1, l2));
    }

    public static ListNode createList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int x : arr) {
            curr.next = new ListNode(x);
            curr = curr.next;
        }
        return dummy.next;
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + (node.next != null ? " -> " : ""));
            node = node.next;
        }
        System.out.println();
    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode currentNode = dummy;

        int val;
        int extraNext = 0;
        while (l1 != null || l2 != null || extraNext != 0) {
            val = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + extraNext;
            if (val >= 10) {
                val = val - 10;
                extraNext = 1;
            } else {
                extraNext = 0;
            }

            currentNode.next = new ListNode(val);
            currentNode = currentNode.next;

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }

        return dummy.next;
    }

    public static class ListNode {
        int val;
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
}
