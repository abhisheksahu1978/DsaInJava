public class CreateLinkedList{
    public static void main(String[] args){
        // First node
        Node first = new Node(10);
        // Second node
        Node second = new Node(20);
        // Third node
        Node third = new Node(30);
        // Nodes ko connect karna
        first.next = second;
        second.next = third;
        // Linked List print
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
// Node class
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}