package fc.java.part2;

public class ArrayTest {
    public static void main(String[] args) {
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = 10;
            System.out.println("a[" + i + "] = " + a[i]);
        }

        int[] b = {10, 20, 30, 40, 50};
        int[] c;
        c = new int[]{10, 20, 30, 40, 50};

        System.out.println(b[0] + b[3]);
        System.out.println(c.length);
        
    }
}