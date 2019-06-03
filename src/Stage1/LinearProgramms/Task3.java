package Stage1.LinearProgramms;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number x:");
        double x = scanner.nextDouble();

        System.out.print("Input number y:");
        double y = scanner.nextDouble();

        double z = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
        System.out.print("z = " + z);
    }
}
