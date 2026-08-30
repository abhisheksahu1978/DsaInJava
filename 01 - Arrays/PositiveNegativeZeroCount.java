public class PositiveNegativeZeroCount{
    public static void main(String[] args){
        int arr[] = {13, 12, 14, 15, 16, -13, -12, -14, 0, 0, 0, 0};
        int Positive = 0;
        int Negative = 0;
        int Zero = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0){
                Positive++;
            }
            else if (arr[i] < 0){
                Negative++;
            }
            else{
                Zero++;
            }
        }
        System.err.println("positive : "+ Positive);
        System.err.println("Negative : "+ Negative);
        System.err.println("Zero : "+ Zero);


    }
}