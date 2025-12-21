public class TwentyOneDecember {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode head;

    public static void addNode(ListNode newNode) {
        if (head == null) {
            head = newNode;
            return;
        }

        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public static void deleteNode(ListNode node) {
        if (node == null || node.next == null) {
            System.out.println("Cannot delete last node");
            return;
        }
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void printListNode() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + "==>");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static ListNode removeNthNodeFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        int sz = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (sz < n) {
            return head;
        }
        if (sz == n) {
            return head.next;
        }
        int i = 0;
        int j = sz - n;
        ListNode prev = head;
        while (i < j - 1) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }

    public static void main(String[] args) {
        addNode(new ListNode(10));
        addNode(new ListNode(20));
        addNode(new ListNode(30));
        addNode(new ListNode(50));
        addNode(new ListNode(40));

        printListNode();

        deleteNode(head.next.next.next);

        printListNode();
    }
}


