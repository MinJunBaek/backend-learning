package fc.java.part2;

public class LoopLoopTest {
    public static void main(String[] args) {
        // 이중 for문을 사용하여 구구단 출력
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.format("%d x %d = %d  ", i, j, i * j);
            }//_j
            System.out.println();
        }//_i (이렇게 반복문의 끝을 표시하는것도 좋다)

        System.out.println("또 다른 구구단");
        // 또 다른 구구단 출력
        for (int i = 2; i <= 9; i++) {
            System.out.format("%7s" + "%4s", i + "단", "");
        }
        System.out.println();
        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.print(j + " x " + i + " = " + (i*j)+"\t");
            }//_j
            System.out.println();
        }//_i

        // 2차원배열 원소 출력
        int[][] a = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10}
        };

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }//_i
            System.out.println();
        }//_j
    }
}