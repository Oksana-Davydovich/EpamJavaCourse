package Stage1.LinearProgramms;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input x:");
        int x = scanner.nextInt();
        System.out.print("Input y:");
        int y = scanner.nextInt();

        boolean result = (x >= -2 && x <= 2 && y >= 0 && y <= 4) || (x >= -4 && x <= 4 && y >= -3 && y <= 0);
        System.out.println(result);
    }
}
