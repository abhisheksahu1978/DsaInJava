public class PalidromeString{
    public static void main(String[] args) {
     String original = "madam";
     String reverse = "" ;

     //pahale last index se suru karenge aur har index ko reverse mein check karenge aur phir condition bhi
     for(int i = original.length()-1; i >= 0; i--){
        reverse = reverse + original.charAt(i);
     }
     //original ko reverse se compare karne ke liye
     if (original.equals(reverse)){
            System.out.print("Palidrome ");
        }else{
            System.out.print("Not a Palidrome ");
        }

    }
}