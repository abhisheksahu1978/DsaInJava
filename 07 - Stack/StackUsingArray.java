public class StackUsingArray {

    int[] stack = new int[5];
    int top = -1;

    // Push
    void push(int value) {
        stack[++top] = value;
    }

    // Pop
    void pop() {
        System.out.println("Deleted: " + stack[top--]);
    }

    // Display
    void display() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {

        StackUsingArray s = new StackUsingArray();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        s.pop();
    }
}