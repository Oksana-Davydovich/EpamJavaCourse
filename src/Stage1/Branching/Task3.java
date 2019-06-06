package Stage1.Branching;

import Stage1.Common.Input;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int x1 = Input.getInt("Input x1:");
        int y1 = Input.getInt("Input y1:");
        int x2 = Input.getInt("Input x2:");
        int y2 = Input.getInt("Input y2:");
        int x3 = Input.getInt("Input x3:");
        int y3 = Input.getInt("Input y3:");

        double b1 = calculateB(x1, y1, x2, y2);
        double k1 = calculateK(x1, y1, b1);

        double b2 = calculateB(x2, y2, x3, y3);
        double k2 = calculateK(x2, y2, b2);

        if (b1 == b2 && k1 == k2)
            System.out.print("These three points belong to one line.");
        else
            System.out.print("These three points don't belong to one line.");
    }

    public static double calculateB (int x1, int y1, int x2, int y2) {
        double b = (x2*y1 - x1*y2) / (x2 - x1);
        return b;
    }
    public static double calculateK (int x1, int y1, double b) {
        double k = (y1 - b) / x1;
        return k;
    }

}
