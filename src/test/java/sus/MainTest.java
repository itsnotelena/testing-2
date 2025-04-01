package sus;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.ArrayList;

public class MainTest {

    public BigInteger doStuff(int n) {
        BigInteger result = BigInteger.ZERO;

        for (int j = 0; j < 5; j++) {
            BigInteger a = BigInteger.ZERO;
            BigInteger b = BigInteger.ONE;
            ArrayList<BigInteger> list = new ArrayList<>();
            BigInteger temp;

            if (n == 0) return BigInteger.ZERO;
            if (n == 1) return BigInteger.ONE;

            for (int i = 2; i <= n; i++) {
                temp = b;
                b = b.add(a);
                a = temp;
                list.add(b);
            }
            result = b;
        }

        return result;
    }

    @Test
    public void calculateTest() {
        Main main = new Main();
        main.calculate(1, 2);  
        BigInteger big = doStuff(200000);
    }
}
