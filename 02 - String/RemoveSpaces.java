public class RemoveSpaces{
    public static void main(String[] args){
        String name = "Abhishek kumar. I am a normal engineering student.";
        String result = "";

        for (int i = 0; i < name.length(); i++){
            char ch = name.charAt(i);
            
        // Agar character space nahi hai
        if (ch != ' '){
            result = result + ch;
        }
        }

        System.out.print(result);
    }
}