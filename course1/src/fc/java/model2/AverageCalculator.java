package fc.java.model2;

// Number 타입과 그 하위 클래스만 올수있게 제한을 두는것
public class AverageCalculator<T extends Number> {
    private T[] numbers;

    public AverageCalculator(T[] numbers) {
        this.numbers = numbers;
    }

    public double calculatorAverage() {
        double sum = 0.0;
        for (T number : numbers) {
            sum += number.doubleValue();
        }
        return sum / numbers.length;
    }

}
