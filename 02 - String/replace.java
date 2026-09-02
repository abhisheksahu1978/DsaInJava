public class replace{
    public static void main(String[] args){
        String name = "Abhishek kumar";
        // ishmein replace(old char/string, new char/string) kuch ish tarah se hota jish char ko change karna ho.
        String value = name.replace('A','a');
        String value2 = name.replace("Abhi","luck");

        System.out.println(value);
        System.out.println(value2);

    }
}