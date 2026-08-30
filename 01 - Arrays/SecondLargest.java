import java.util.Arrays;
public class SecondLargest{
    public static void main(String[] args){
        int arr[] = {13, 12, 45, 15, 16, 17, 14};
        Arrays.sort(arr);
        // System.err.println(Arrays.toString(arr));
        int secondlargest = arr[arr.length - 2];
        System.err.println("second largest no is : "+ secondlargest);        
    }
}