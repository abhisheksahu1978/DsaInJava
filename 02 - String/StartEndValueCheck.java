public class StartEndValueCheck{
    public static void main(String[] args){
        String name = "Abhishek kumar";
        // yeh check karta hai ki jo maine element liya hai kya uwah string mein as it is hai ya nhi.
        // yeh boolean value return karta hai.
        boolean value = name.startsWith("Abhi");
        boolean value2 = name.startsWith("kum");
        System.out.println(value);
        System.out.println(value2);

        // yeh check karta hai ki yeh element last mein hai ya nhi.
        boolean lala = name.endsWith("mar");
        boolean lala2 = name.endsWith("ek");
        System.out.println(lala);
        System.out.println(lala2);
    }
}