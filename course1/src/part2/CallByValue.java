package fc.java.part2;

public class CallByValue {
    public static void main(String[] args) {
        float a = 56.7f;
        float b = 78.9f;
        // a + b = ?
        float sum = floatAdd(a, b); // (call by value)
        System.out.println("sum = " + sum);
    }

    public static float floatAdd(float a, float b) {
        float sum = a + b;
        return sum;
    }
}
