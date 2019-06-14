package Algorithmization.oneDimensionalArray;

import Stage1.Common.Input;

public class Task6 {
    public static void main(String[] args) {
        int n = Input.getInt("Input n: ");
        double[] array = new double[n];

        for (int i = 0; i < n; i++) {
            array[i] = Input.getDouble("Input n" + i + ": ");
        }


        double sum = 0;
        for (int i = 2; i < n; i++){
            boolean isSimple = true;
            for (int j = 2; j < i - 1; j++) {
               if (i % j == 0 ) {
                   isSimple = false;
                   break;
               }
            }

            if (isSimple){
                sum = sum + array[i];
            }
        }
        System.out.println("Sum: " + sum);
    }
}
