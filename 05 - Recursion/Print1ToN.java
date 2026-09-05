import java.util.Scanner;
public class Print1ToN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int number;

        for(int i = 1; i <= n; i++){
            number =  i;
            System.out.print(" "+number);
        }
    }
}