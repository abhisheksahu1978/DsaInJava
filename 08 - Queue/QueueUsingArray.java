public class QueueUsingArray {

    int[] q = new int[5];
    int front = 0, rear = -1;

    void enqueue(int x) {
        q[++rear] = x;
    }

    void dequeue() {
        System.out.println("Deleted: " + q[front++]);
    }

    void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print(q[i] + " ");
        }
    }

    public static void main(String[] args) {

        QueueUsingArray q = new QueueUsingArray();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        q.dequeue();
    }
}