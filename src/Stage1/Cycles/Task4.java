package Stage1.Cycles;

import java.math.BigInteger;

public class Task4 {
    public static void main(String[] args) {
        BigInteger product = BigInteger.valueOf(1);
        for (int i = 2; i <= 200; i ++){
            product = product.multiply(BigInteger.valueOf((int)Math.pow(i, 2)));
        }
        System.out.print("Product: " + product);
    }
}
