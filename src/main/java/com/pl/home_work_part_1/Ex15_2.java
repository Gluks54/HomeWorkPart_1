package com.pl.home_work_part_1;

import java.math.BigInteger;

public class Ex15_2 {
    BigInteger a = new BigInteger("1");
    BigInteger b = new BigInteger("1");
    BigInteger c = new BigInteger("0");

    public BigInteger fib(int x) {
        for (int i = 0; i <= x; i++) {
            c = a.add(b);
            a = b;
            b = c;
        }
        return c;
    }
}
