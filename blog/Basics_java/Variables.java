import java.util.Date;

public class Variables{

    public static void main(String[] args) {
        //System.out.println("Hi My name is Dina!");
        // int age = 24;
        // System.out.print(age);

        // byte --> 1 byte -128 -- 127
        // short --> 2 byte -32k -- 32k
        // int --> 4 byte -2b -- 2b
        // long --> 8 byte

        // float --> 4 byte
        // double --> 8 byte

        // char
        // boolean 1 byte --> True or False
        // string

        byte age = 24;
        long viewCount = 6123456789L;
        float price = 18.99F;
        boolean darkMode = false;

        Date now = new Date();
        now.getTime();

        System.out.println(now);
        String my_name = "Dina" + " Bakhtiari";
        System.out.println(my_name.startsWith("Di"));
        System.out.println(my_name.length());
        System.out.println(my_name.indexOf("n"));
        System.out.println(my_name.replace("Dina", "Diaro"));
        System.out.println("-----------------------------");

    }
}