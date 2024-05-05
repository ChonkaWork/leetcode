package easy;

import java.util.Arrays;

public class AverageSalaryExcludingMinAndMax {

    private static double average(int[] ints) {
        return Arrays.stream(ints).sorted().skip(1).limit(ints.length - 2).average().orElseThrow();
    }

    private static double averageSimple(int[] ints) {
        int sum = 0;
        int min = ints[0];
        int max = ints[0];
        for (int i = 0; i < ints.length; i++) {
            int current = ints[i];
            if (min > current) {
                min = current;
            }
            if (max < current) {
                max = current;
            }
        }

        for (int i = 0; i < ints.length; i++) {
            int current = ints[i];
            if (current != min && current != max) {
                sum += current;
            }
        }
        return (double) sum / (ints.length - 2);
    }
}
