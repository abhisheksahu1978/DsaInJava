public class AverageOfArray{
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        double average;
        double sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        average = sum/arr.length;
        System.err.println("average of array is : "+ average);
    }
}