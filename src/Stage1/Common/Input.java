package Stage1.Common;

import java.util.Scanner;

public class Input {
    public static Scanner scanner = new Scanner(System.in);

    public static int getInt(String message) {
        System.out.print(message);
        return scanner.nextInt();
    }

    public static double getDouble(String message) {
        System.out.print(message);
        return scanner.nextDouble();
    }
}
