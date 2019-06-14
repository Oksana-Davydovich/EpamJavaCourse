package Algorithmization.oneDimensionalArray;

import Stage1.Common.Input;

public class Task7 {
    public static void main(String[] args) {
        int n = Input.getInt("Input n: ");
        double[] array = new double[2 * n];

        for (int i = 0; i < 2 * n; i++) {
            array[i] = Input.getDouble("Input n" + i + ": ");
        }

        double max = 0;
        for (int i = 0; i < 2 * n; i++){
            double j = array[i] + array[2 * n - 1 - i];
            if (j > max) {
                max = j;
            }
        }

        System.out.print(max);
    }
}
