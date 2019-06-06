package Stage1.Branching;

import Stage1.Common.Input;

public class Task5 {
    public static void main(String[] args) {
        int x = Input.getInt("Input x:");
        int y;

        if (x <= 3)
            y = (int)(Math.pow (x, 2) - 3 * x + 9);
        else
            y = 1 /(int)(Math.pow(x, 3) + 6);

        System.out.print("F(x) = " + y);
    }
}
