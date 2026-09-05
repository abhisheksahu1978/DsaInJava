public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 5;

        int a = 1;
        int b = 1;

        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println(b);
    }
}