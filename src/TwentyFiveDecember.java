public class TwentyFiveDecember {
//    Merry Christmas

    static class LinkedList {
        int val;
        LinkedList next;

        LinkedList(int val) {
            this.val = val;
            this.next = null;
        }

        LinkedList() {

        }
    }

    public static LinkedList head;

    public static void addNode(LinkedList newNode) {
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

    public static void print() {
        if (head == null) {
            return;
        }
        LinkedList temp = head;

        while (temp != null) {
            System.out.print(temp.val + "==>");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static LinkedList reverseList(LinkedList head) {
        LinkedList prev = null;
        LinkedList curr = head;
        LinkedList next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }


    public static void main(String[] args) {
        addNode(new LinkedList(10));
        addNode(new LinkedList(20));
        addNode(new LinkedList(30));
        addNode(new LinkedList(40));
        addNode(new LinkedList(50));
        addNode(new LinkedList(60));
        addNode(new LinkedList(70));
        addNode(new LinkedList(80));
        addNode(new LinkedList(90));
        addNode(new LinkedList(100));
        addNode(new LinkedList(1000));

        print();

        head = reverseList(head);

        print();

    }
}
