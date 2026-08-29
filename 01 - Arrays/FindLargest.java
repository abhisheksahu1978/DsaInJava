public class FindLargest{
    public static void main(String[] args){

        // int arr[] = {10, 20, 30, 40, 50};
        int arr[] = {67, 23, 56, 34, 78, 89};
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++){
            if (arr[i] > largest){
                largest = arr[i];
            }
        }

        System.out.println("largest element: " + largest);
    }
}