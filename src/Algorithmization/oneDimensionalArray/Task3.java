package Algorithmization.oneDimensionalArray;

import Stage1.Common.Input;

public class Task3 {
    public static void main(String[] args) {
        int n = Input.getInt("Input n: ");
        double[] array = new double[n];

        for (int i = 0; i < n; i++) {
            array[i] = Input.getDouble("Input n" + i + ": ");
        }

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < n; i++) {
            if (array[i] > 0) {
                positive++;
            } else if (array[i] < 0) {
                negative++;
            } else zero++;
        }

        System.out.println(positive);
        System.out.println(negative);
        System.out.println(zero);
    }
}
