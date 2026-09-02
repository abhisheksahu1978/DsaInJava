public class CountOccurrence{
    public static void main(String[] args) {
        int arr[] = {10, 23, 45, 6, 6, 6, 7, 9};

        int search = 6;
        int count = 0;

        for (int i = 0; i < arr.length; i++){
            if(arr[i]==search){
            count++;
            }
        }
        System.out.println(count);
    }
}