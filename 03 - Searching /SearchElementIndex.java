public class SearchElementIndex{
    public static void main(String[] args){
        int arr[] = {11, 22, 33, 44, 55, 66};
        int Search = 55;
        boolean found = false;

        for (int i = 0; i < arr.length; i++){
            if(arr[i] == Search){
                found = true;
                System.out.print("element found on index: "+i);
                break;
            }
        }
        if(!found){
            System.out.print("denied ");
        }
    }

}