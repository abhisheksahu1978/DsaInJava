import java.util.Arrays;
public class KthLargest {
    public static void main(String[] args) {
        int[] arr = {10, 30, 20, 50, 40};
        int k = 2;
        Arrays.sort(arr);
        System.out.println("Kth Largest: " + arr[arr.length - k]);
    }
}