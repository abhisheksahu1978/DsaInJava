public class CountVowels{
    public static void main(String[] args){
        String name = "Abhishek";
        int count = 0;

        for (int i = 0; i < name.length(); i++){
            char s = name.charAt(i);

            if ( s == 'a' || s == 'i' || s == 'o' || s == 'u' || s == 'e' || s == 'A' || s == 'I' || s == 'O' || s == 'U' || s == 'E'){
                count++;
            }
        }

        System.out.print("Number of vowels: "+ count);
        
    }
}