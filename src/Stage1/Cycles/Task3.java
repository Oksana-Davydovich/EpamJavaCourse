package Stage1.Cycles;

public class Task3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i ++){
            sum += (int) Math.pow(i, 2);
        }
        System.out.print("Sum: " + sum);
    }
}
