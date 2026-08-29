public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Original Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Array ko reverse karna
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println("\nReversed Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}