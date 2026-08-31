public class LinearSearch{
    public static void main (String[] args){
        int arr[] = {11, 22, 33, 44, 55, 66};
        boolean num = false;
        int Search = 44;
        

        for (int i = 0; i < arr.length; i++){
            if(arr[i]== Search){
                num = true;
                break;
            }
        }
        if(num){
            System.out.print("44");
        }else{
            System.out.print("denied");
        }
    }
}