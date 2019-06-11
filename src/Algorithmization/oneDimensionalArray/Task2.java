package Algorithmization.oneDimensionalArray;

import Stage1.Common.Input;

public class Task2 {
    public static void main(String[] args) {
        int a = Input.getInt("Input a: ");
        double[] array = new double[a];

        for (int i = 0; i < a; i++){
            array[i] = Input.getDouble("Input a" + i + ": ");
        }

        double z = Input.getDouble("Input z: ");

        int replacementsCount = 0;

        for (int i = 0; i < a; i++) {
            if (array[i] > z) {
                array[i] = z;
                replacementsCount++;
            }
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.print(replacementsCount);
    }
}
