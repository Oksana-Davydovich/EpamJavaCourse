package Stage1.Cycles;

import Stage1.Common.Input;

public class Task8 {
    public static void main(String[] args) {
        int a = Input.getInt("Input a:");
        int b = Input.getInt("Input b:");

        for (int i = 10; a != 0;) {
            int ai = a % i;
            a = (a - ai) / 10;

            int tempB = b;
            for (int j = 10; tempB != 0;) {
                int bj = tempB % j;
                tempB = (tempB - bj) / 10;

                if (ai == bj) {
                    System.out.println(ai);
                }
            }
        }
    }
}
