package Stage1.Cycles;

import Stage1.Common.Input;

public class Task5 {
    public static void main(String[] args) {
        double e = Input.getDouble("Input e:");
        double sum = 0;

        for (int n = 0; ; n++) {
            double an = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);

            if (Math.abs(an) >= e) {
                sum += an;
                System.out.println("An: " + an + ", n: " + n);
            }
            else
                break;
        }
        System.out.print("Sum: " + sum);
    }
}
