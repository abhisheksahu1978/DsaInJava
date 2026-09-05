import java.util.PriorityQueue;

public class MinHeap {

    public static void main(String[] args) {

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        heap.add(30);
        heap.add(10);
        heap.add(20);
        heap.add(5);

        while (!heap.isEmpty()) {
            System.out.print(heap.poll() + " ");
        }
    }
}