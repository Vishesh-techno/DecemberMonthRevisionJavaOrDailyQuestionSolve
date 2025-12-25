public class TwentyFiveDecember {
//    Merry Christmas

    static class LinkedList {
        int val;
        LinkedList next;
        LinkedList head;

        LinkedList() {
        }

        LinkedList(int val) {
            this.val = val;
            this.next = null;
        }


//    public static LinkedList head;

        public void add(int value) {
            LinkedList newNode = new LinkedList(value);

            if (head == null) {
                head = newNode;
                return;
            }

            LinkedList temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }

//    public static void addNode(LinkedList newNode) {
//        if (head == null) {
//            head = newNode;
//            return;
//        }
//
//        LinkedList temp = head;
//
//        while (temp.next != null) {
//            temp = temp.next;
//        }
//
//        temp.next = newNode;
//    }

        public void print() {
//        if (head == null) {
//            return;
//        }
            LinkedList temp = head;

            while (temp != null) {
                System.out.print(temp.val + "==>");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public void reverseList() {
            LinkedList prev = null;
            LinkedList curr = head;
            LinkedList next;

            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
//        return prev;
            head = prev;
        }

        public static LinkedList mergeSortedList(LinkedList l1, LinkedList l2) {
            LinkedList dummy = new LinkedList(0);

            LinkedList curr = dummy;

            LinkedList list1 = l1.head;
            LinkedList list2 = l2.head;

            while (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    curr.next = list1;
                    curr = list1;
                    list1 = list1.next;
                } else {
                    curr.next = list2;
                    curr = list2;
                    list2 = list2.next;
                }
            }
            if (list1 == null) {
                curr.next = list2;
            } else {
                curr.next = list1;
            }
            return dummy.next;
        }

        public static void printList(LinkedList node) {
            while (node != null) {
                System.out.print(node.val + "==>");
                node = node.next;
            }
            System.out.println("null");
        }
    }


    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(80);
        ll.add(100);

        LinkedList ll1 = new LinkedList();
        ll1.add(101);
        ll1.add(200);
        ll1.add(201);
        ll1.add(202);
        ll1.add(203);
        ll1.add(205);

        System.out.print("List-1:");
        ll.print();

        System.out.println();

        System.out.print("List-2:");
        ll1.print();

        System.out.println();

//        ll.reverseList();
//        System.out.print("Reversed List-1:");
//        ll.print();
//
//        System.out.println();
//
//        ll1.reverseList();
//        System.out.print("Reversed List-2:");
//        ll1.print();

//        System.out.println();

        LinkedList mergedHead = LinkedList.mergeSortedList(ll, ll1);

        System.out.print("Merged List: ");
        LinkedList.printList(mergedHead);

    }
}

