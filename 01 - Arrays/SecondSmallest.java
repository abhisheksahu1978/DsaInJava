import java.util.Arrays;
public class SecondSmallest{
    public static void main(String[] args) {
        int arr[] = {12, 23, 14, 15, 16, 17, 18};
        Arrays.sort(arr);
        System.out.println("second smallest : "+ arr[1]);
    }
}