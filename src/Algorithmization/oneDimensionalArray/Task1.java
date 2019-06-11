package Algorithmization.oneDimensionalArray;

import Stage1.Common.Input;

public class Task1 {
    public static void main(String[] args) {
        int N = Input.getInt("Input N: ");
        int[] arrayN = new int[N];

        for (int i = 0; i < N; i++){
            arrayN[i] = Input.getInt("Input N" + i + ": ");
        }

        int k = Input.getInt("Input k: ");
        int sum = 0;
        for (int j = 0; j < N; j++){
            if (arrayN[j] % k == 0){
                sum = sum + arrayN[j];
            }
        }
        System.out.println("Sum: " + sum);
    }
}
