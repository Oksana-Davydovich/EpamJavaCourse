package Stage1.Branching;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a:");
        int a = scanner.nextInt();
        System.out.print("Input b:");
        int b = scanner.nextInt();

        if (a + b > 180) {
            System.out.println("Such triangle doesn't exist.");
            return;
        }

        System.out.println("Such triangle exist.");

        if (a == 90 || b == 90 || a + b == 90)
            System.out.println("This triangle is right-angled.");
        else
            System.out.println("This triangle isn't right-angled.");
    }
}
