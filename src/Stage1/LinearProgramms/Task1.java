package Stage1.LinearProgramms;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number a:");
        int a = scanner.nextInt();

        System.out.print("Input number b:");
        int b = scanner.nextInt();

        System.out.print("Input number с:");
        int c = scanner.nextInt();

        double z = ((a - 3) * b / 2) + c;
        System.out.print("z = " + z);
    }
}
