package Stage1.LinearProgramms;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number R:");
        double R = scanner.nextDouble();

        int R1000 = (int) (R * 1000);
        int d3 = R1000 % 10;
        R1000 = (R1000 - d3) / 10;
        int d2 = R1000 % 10;
        R1000 = (R1000 - d2) / 10;
        int d1 = R1000 % 10;
        R1000 = (R1000 - d1) / 10;
        int n3 = R1000 % 10;
        R1000 = (R1000 - n3) / 10;
        int n2 = R1000 % 10;
        R1000 = (R1000 - n2) / 10;
        int n1 = R1000 % 10;

        System.out.print(Integer.toString(d3)+ Integer.toString(d2) + Integer.toString(d1) + "." + Integer.toString(n3) + Integer.toString(n2) + Integer.toString(n1));
    }
}
