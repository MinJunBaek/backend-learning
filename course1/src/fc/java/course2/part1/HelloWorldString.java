package fc.java.course2.part1;

// import java.lang.*;

public class HelloWorldString {
    public static void main(String[] args) {
        String str1 = new String("HelloWorld"); // Heap
        String str2 = new String("HelloWorld");

        String str3 = "HelloWorld"; // Literal Pool
        String str4 = "HelloWorld";

        System.out.println(str1);
        System.out.println(str3);
    }
}
