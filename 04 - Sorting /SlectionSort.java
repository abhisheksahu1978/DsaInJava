public class SlectionSort{
    public static void main(String[] args) {
     int arr[] = {12, 1, 23, 4, 24, 5, 67};

     for(int i = 0; i < arr.length-1; i++){
        int smallest = i;
        for(int j = i+1; i < arr.length; j++){
            if (arr[smallest] > arr[j]){
                smallest = j;
            }
        }
        int temp = smallest;
        arr[smallest] = arr[i];
        arr[i] = temp;
     }   
     System.out.print("Selection sort: ");
     for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i]);
     }
    }
}