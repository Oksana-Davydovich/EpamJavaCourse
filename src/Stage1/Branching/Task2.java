package Stage1.Branching;

import Stage1.Common.MyMath;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number a:");
        int a = scanner.nextInt();
        System.out.print("Input number b:");
        int b = scanner.nextInt();
        System.out.print("Input number c:");
        int c = scanner.nextInt();
        System.out.print("Input number d:");
        int d = scanner.nextInt();

        int result = MyMath.max(MyMath.min(a, b), MyMath.min(c, d));
        System.out.print(result);
    }
}
