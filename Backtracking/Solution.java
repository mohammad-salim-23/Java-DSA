class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {
    Node head;

    public void swapNodes(int x, int y) {
        if (x == y) return;

        Node prevX = null, currX = head;
        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        Node prevY = null, currY = head;
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        if (currX == null || currY == null) return;

        // If x is not the head of the linked list
        if (prevX != null) {
            prevX.next = currY;
        } else {
            head = currY;
        }

        // If y is not the head of the linked list
        if (prevY != null) {
            prevY.next = currX;
        } else {
            head = currX;
        }

        // Swap next pointers
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }

    public void push(int new_data) {
        Node new_Node = new Node(new_data);
        new_Node.next = head;
        head = new_Node;
    }

    public void printList() {
        Node tNode = head;
        while (tNode != null) {
            System.out.print(tNode.data + " ");
            tNode = tNode.next;
        }
    }

    public static void main(String[] args) {
        Solution llist = new Solution();
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);
        

        System.out.print("\nLinked list before ");
        llist.printList();

        llist.swapNodes(2, 4);

        System.out.print("\nLinked list after ");
        llist.printList();
    }
}
