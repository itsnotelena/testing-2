package sus;

import org.junit.Test;

import java.math.BigInteger;
import java.util.ArrayList;

public class MainTest {

    public BigInteger doStuff(int n){
        System.out.println("Hello, World!");
        if (n == 0) return BigInteger.ZERO;
        if (n == 1) return BigInteger.ONE;

        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;

        ArrayList<BigInteger> list = new ArrayList<>();
        BigInteger temp;

        for (int i = 2; i <= n; i++) {
            temp = b;
            b = b.add(a);
            a = temp;
            list.add(b);
        }
        return b;
    }

    @Test
    public void calculateTest() {
        Main main = new Main();
        main.calculate(1, 2);
        BigInteger big = doStuff(310000);
    }
}