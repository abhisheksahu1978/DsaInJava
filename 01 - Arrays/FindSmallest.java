public class FindSmallest{
    public static void main(String[] args) {
        int arr[] = {23, 45, 12, 24, 56, 78};
        int smallest = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        
        System.out.println("Smallest element: "+ smallest);
    }
}