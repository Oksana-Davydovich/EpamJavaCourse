package Stage1.Cycles;

import Stage1.Common.Input;

public class Task1 {
    public static void main(String[] args) {
        int x = Input.getInt("Input x:");
        int y = 0;

        for (int i = 1; i < x; i++){
            y = y + i;
        }
        System.out.print("Sum:" + y);
    }
}
