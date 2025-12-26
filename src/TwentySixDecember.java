import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    static ListNode head;
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

    ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }

        if (fast == null || fast.next == null) {
            return null;
        }

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;

        while (temp1 != null) {
            ListNode temp2 = headB;
            while (temp2 != null) {
                if (temp1 == temp2) {
                    return temp1;
                }
                temp2 = temp2.next;
            }
            temp1 = temp1.next;
        }
        return null;
    }

    ListNode getIntersectionNodeII(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }

        while (headB != null) {
            if (set.contains(headB)) {
                return headB;
            }
            set.add(headB);
            headB = headB.next;
        }
        return null;
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

        if (ll.detectCycle(head) == null) {
            System.out.println("Cycle not detected");
        } else {
            System.out.println(ll.detectCycle(head));
        }

    }
}
