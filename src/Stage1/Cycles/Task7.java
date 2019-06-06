package Stage1.Cycles;

import Stage1.Common.Input;

public class Task7 {
    public static void main(String[] args) {
        int m = Input.getInt("Input m:");
        int n = Input.getInt("Input n:");

        for (int i = m; i <= n; i++) {
            System.out.println("Number " + i);
            for (int j = 1; j <= i; j++) {
                if (i % j == 0 && j != 1 && j != i)
                    System.out.println(j);
            }
        }
    }
}
