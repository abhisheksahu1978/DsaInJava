public class sub_String{
    public static void main (String[] args){
        String name = "Abhishek kumar";
        // yeh actually substring mein index likha jata hai jaha se hamko print karna hota hai.
        String value = name.substring(3);
        // yeh starting index and ending index print karta hai lekin end bala index print nhi karta jaise 4 vala nhi 3 tak hin.
        String value2 = name.substring(2,4);
        // ishko substring(int start idx, int end idx)
        System.out.println(value);
        System.out.println(value2);
    }
}