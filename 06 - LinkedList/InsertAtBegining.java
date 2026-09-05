public class InsertAtBegining {

    public static void main(String[] args) {

        // Existing Linked List
        Node first = new Node(20);
        Node second = new Node(30);

        first.next = second;

        // New node
        Node newNode = new Node(10);

        // Beginning mein insert
        newNode.next = first;
        first = newNode;

        // Print Linked List
        Node temp = first;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}