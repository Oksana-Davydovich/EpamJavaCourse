package Algorithmization.oneDimensionalArray;

import Stage1.Common.Input;

public class Task4 {
    public static void main(String[] args) {
        int a = Input.getInt("Input a: ");
        double[] array = new double[a];

        for (int i = 0; i < a; i++) {
            array[i] = Input.getDouble("Input a" + i + ": ");
        }

        double min = array[0];
        int minPosition = 0;

        double max = array[0];
        int maxPosition = 0;

        for (int i = 1; i < a; i++){
            if (array[i] < min) {
                min = array[i];
                minPosition = i;
            }

            if (array[i] > max){
                max = array[i];
                maxPosition = i;
            }
        }

        array[maxPosition] = min;
        array[minPosition] = max;

        for (int i = 0; i < a; i++){
            System.out.print(array[i] + " ");
        }
    }
}
