package Stage1.Common;

public class MyMath {
    public static int min(int x, int y) {
        if (x > y)
            return y;
        else
            return x;
    }

    public static int max(int x, int y) {
        if (x > y)
            return x;
        else
            return y;
    }
}
