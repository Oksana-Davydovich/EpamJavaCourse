package Algorithmization.oneDimensionalArray;

import Stage1.Common.Input;

public class Task5 {
    public static void main(String[] args) {
        int a = Input.getInt("Input a: ");
        double[] array = new double[a];

        for (int i = 0; i < a; i++){
            array[i] = Input.getDouble("Input a" + i + ": ");
        }

        for (int i = 0; i < a; i++) {
            if (array[i] > i) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
