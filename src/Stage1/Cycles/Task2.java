package Stage1.Cycles;

import Stage1.Common.Input;

public class Task2 {
    public static void main(String[] args) {
        int a = Input.getInt("Input a:");
        int b = Input.getInt("Input b:");
        int h = Input.getInt("Input h:");
        int y = 0;

        for (int i = a; i <= b; i = i + h) {
            if (i > 2)
                y = i;
            else y = -i;

            System.out.println("y: " + y);
        }
        }
    }

