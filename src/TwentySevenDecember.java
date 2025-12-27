public class TwentySevenDecember {
    static class ListNode {
        int val;
        ListNode next;
        ListNode head;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }

        void addNode(int val) {
            ListNode newNode = new ListNode(val);

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

        void print() {
            if (head == null) {
                return;
            }

            ListNode temp = head;
            while (temp != null) {
                System.out.print(temp.val + "==>");
                temp = temp.next;
            }
            System.out.println("null");
        }

        ListNode removeNthNodeFromEnd(ListNode head, int n) {
            if (head == null) {
                return head;
            }
            ListNode temp = head;
            int sz = 0;
            while (temp != null) {
                temp = temp.next;
                sz++;
            }

            if (sz < n || sz == 0) {
                return head;
            }

            if (sz == n) {
                return head.next;
            }
            ListNode prev = head;
            int i = 0, j = sz - n;
            while (i < j - 1) {
                prev = prev.next;
                i++;
            }
            prev.next = prev.next.next;

            return head;
        }

        ListNode removeElements(ListNode head, int val) {
            while (head != null && head.val == val) {
                head = head.next;
            }
            ListNode temp = head;
            while (temp != null) {
                if (temp.next != null && temp.next.val == val) {
                    temp.next = temp.next.next;
                } else {
                    temp = temp.next;
                }
            }
            return head;
        }


    }

    public static void main(String[] args) {
        ListNode list = new ListNode(0); // dummy object
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);
        list.addNode(50);

        System.out.print("Before: ");
        list.print();

        list.head = list.removeNthNodeFromEnd(list.head, 2);

        System.out.print("After removing 2nd from end: ");
        list.print();

        list.removeElements(list.head, 30);
        list.print();
    }
}
