package Stage1.LinearProgramms;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number a:");
        double a = scanner.nextDouble();

        System.out.print("Input number b:");
        double b = scanner.nextDouble();

        System.out.print("Input number с:");
        double c = scanner.nextDouble();

        double z = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.print("z = " + z);
    }
}
