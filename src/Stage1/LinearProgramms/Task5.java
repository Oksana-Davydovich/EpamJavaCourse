package Stage1.LinearProgramms;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input T:");
        int T = scanner.nextInt();

        int hour = T / 3600;
        int min = (T - hour * 3600) / 60;
        int sec = T - hour * 3600 - min * 60;

        System.out.format("%02dч%02dмин%02dс", hour, min, sec);;
    }
}
