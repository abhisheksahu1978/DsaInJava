public class CircularQueue {

    int[] q = new int[5];
    int front = 0, rear = -1;

    void enqueue(int x) {
        rear = (rear + 1) % 5;
        q[rear] = x;
    }

    void dequeue() {
        System.out.println("Deleted: " + q[front]);
        front = (front + 1) % 5;
    }

    void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print(q[i] + " ");
        }
    }

    public static void main(String[] args) {

        CircularQueue c = new CircularQueue();

        c.enqueue(10);
        c.enqueue(20);
        c.enqueue(30);

        c.display();

        c.dequeue();
    }
}