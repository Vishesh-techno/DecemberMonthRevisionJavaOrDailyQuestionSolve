import java.util.Scanner;

public class TwentySevenDecember {
    static class ListNode {
        int val;
        ListNode next;
        ListNode head;
        ListNode tail;

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

        ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode result = new ListNode(0);
            ListNode ptr = result;
            int carry = 0;
            while (l1 != null || l2 != null) {
                int sum = carry;
                if (l1 != null) {
                    sum = sum + l1.val;
                    l1 = l1.next;
                }

                if (l2 != null) {
                    sum = sum + l2.val;
                    l2 = l2.next;
                }

                carry = sum / 10;
                sum = sum % 10;

                ptr.next = new ListNode(sum);
                ptr = ptr.next;
            }
            if (carry == 1) {
                ptr.next = new ListNode(1);
            }
            return result.next;
        }

        ListNode rotateList(ListNode head, int k) {
//            1️⃣ length निकालो
//            2️⃣ k = k % length
//            3️⃣ tail.next = head  (make circular)
//            4️⃣ newTail = (length - k - 1) position पर जाओ
//            5️⃣ newHead = newTail.next
//            6️⃣ newTail.next = null
//            7️⃣ return newHead

            ListNode temp = head;
            int sz = 1;
            while (temp.next != null) {
                sz++;
                temp = temp.next;
            }
            ListNode tail = temp;

            k = k % sz;
            if (k == 0) {
                return head;
            }

            tail.next = head;

            ListNode newTail = head;
            for (int i = 0; i < sz - k - 1; i++) {
                newTail = newTail.next;
            }

            ListNode newHead = newTail.next;

            newTail.next = null;

            return newHead;
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

        Scanner sc = new Scanner(System.in);
//        System.out.print("\nEnter number of nodes in first number list: ");
//        int a = sc.nextInt();
//        ListNode l1 = new ListNode(0);
//        System.out.println("Enter digits:");
//        for (int i = 0; i < a; i++) {
//            l1.addNode(sc.nextInt());
//        }
//
//        System.out.print("\nEnter number of nodes in second number list: ");
//        int b = sc.nextInt();
//        ListNode l2 = new ListNode(0);
//        System.out.println("Enter digits:");
//        for (int i = 0; i < b; i++) {
//            l2.addNode(sc.nextInt());
//        }
//
//        ListNode ans = list.addTwoNumbers(l1.head, l2.head);
//        System.out.print("Addition Result: ");
//        ListNode temp = ans;
//        while (temp != null) {
//            System.out.print(temp.val + "==>");
//            temp = temp.next;
//        }
//        System.out.println("null");

        list.head = list.rotateList(list.head, 7);
        list.print();
    }
}
