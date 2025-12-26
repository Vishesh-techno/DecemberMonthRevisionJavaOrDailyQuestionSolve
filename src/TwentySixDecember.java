import java.util.List;

public class TwentySixDecember {
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }

    }

    ListNode head;
    ListNode tail;

    public TwentySixDecember() {
        head = null;
    }

    public int get(int index) {
        if (index < 0) {
            return -1;
        }

        ListNode temp = head;
        int i = 0;
        while (temp != null) {
            if (i == index) {
                return temp.val;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        tail = newNode;
    }

    void addAtIndex(int index, int val) {
        if (index == 0) {
            ListNode newNode = new ListNode(val);
            newNode.next = head;
            head = newNode;
            if (tail == null) {
                tail = newNode;
                return;
            }
        }
        int i = 0;
        ListNode temp = head;
        while (temp != null && i < index - 1) {
            temp = temp.next;
            i++;
        }

        if (temp == null) {
            return;
        }

        ListNode newNode = new ListNode(val);
        newNode.next = temp.next;
        temp.next = newNode;
        if (newNode.next == null) {
            tail = newNode;
        }
    }

    public void deleteAtIndex(int index) {
        if (index == 0) {
            if (head == null) {
                return;
            }
            head = head.next;
            return;
        }
        ListNode temp = head;
        int i = 0;
        while (temp.next != null && i < index - 1) {
            temp = temp.next;
            i++;
        }
        if (temp == null || temp.next == null) {
            return;
        }
        if (temp.next.next == null) {
            tail = temp;
        }
        temp.next = temp.next.next;
    }

    void print() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + "==>");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        TwentySixDecember ll = new TwentySixDecember();

        ll.addAtHead(10);
        ll.addAtHead(20);
        ll.addAtHead(40);
        ll.addAtHead(30);

        ll.print();

        ll.addAtIndex(4, 50);
        ll.addAtIndex(1, 0);

        ll.print();

        ll.addAtTail(60);
        ll.addAtTail(70);

        ll.print();

        System.out.println("Value at index 5 = " + ll.get(5));

        ll.deleteAtIndex(1);

        ll.print();

    }
}
