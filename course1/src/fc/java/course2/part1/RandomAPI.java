package fc.java.course2.part1;

import java.util.Random;

public class RandomAPI {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[6];
        int i = 0;

        while (i < arr.length) {
            // int num = r.nextInt(45); // 0부터 44까지
            int num = r.nextInt(45) + 1; // +1로 인해 1부터 45까지
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr[j] == num) {
                    isDuplicate = true;
                    break;
                }//
            }//

            if (!isDuplicate) {
                arr[i++] = num;
            }//

        }//

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
