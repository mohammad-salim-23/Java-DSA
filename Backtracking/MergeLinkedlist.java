import java.util.LinkedList;

public class MergeLinkedlist {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class CustomLinkedList {
        Node head;

        public void addLast(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }

        public void addFirst(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void mergesort(CustomLinkedList ll) {
        ll.head = mergesort(ll.head);
    }

    private static Node mergesort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        Node mid = getmid(head);
        // left & right merge sort
        Node righthead = mid.next;
        mid.next = null;
        Node nextL = mergesort(head);
        Node nextR = mergesort(righthead);
        return merge(nextL, nextR);
    }

    private static Node getmid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private static Node merge(Node head1, Node head2) {
        Node mergedll = new Node(-1);
        Node temp = mergedll;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedll.next;
    }

    public static void main(String[] args) {
        CustomLinkedList ll = new CustomLinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        ll.addFirst(5);
        ll.addFirst(3);
        mergesort(ll);
        ll.print();
    }
}
