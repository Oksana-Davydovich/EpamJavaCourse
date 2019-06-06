package Stage1.Branching;

import Stage1.Common.Input;

public class Task4 {
    public static void main(String[] args) {
        int x = Input.getInt("Input x:");
        int y = Input.getInt("Input y:");
        int z = Input.getInt("Input z:");
        int A = Input.getInt("Input A:");
        int B = Input.getInt("Input B:");

        if ((x <= A && y <= B || x <= B && y <= A) || (x <= A && z <= B || x <= B && z <= A) || (y <= A && z <= B || y <= B && z <= A))
            System.out.print("This brick fits.");
        else
            System.out.print("This brick doesn't fit.");
    }
}
