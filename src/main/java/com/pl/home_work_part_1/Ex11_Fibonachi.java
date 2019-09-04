package com.pl.home_work_part_1;

import java.math.BigDecimal;

public class Ex11_Fibonachi {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(1.00);
        BigDecimal b = new BigDecimal(1.00);
        BigDecimal c;

        for (int i = 0; i <= 10; i++) {
            c = a.add(b);
            System.out.println(c + " binary number = "
                    + Integer.toBinaryString(c.toBigInteger().intValue())
                    + " Stosunek -" + (c.divide(b, 8, BigDecimal.ROUND_HALF_UP)));

            a = c.add(b);
            System.out.println(a + " binary number = "
                    + Integer.toBinaryString(a.toBigInteger().intValue())
                    + " Stosunek -" + (a.divide(c, 8, BigDecimal.ROUND_HALF_UP)));

            b = a.add(c);
        }

        System.out.println(b + " binary number = "
                + Integer.toBinaryString(b.toBigInteger().intValue())
                + " Stosunek -" + (b.divide(a, 8, BigDecimal.ROUND_HALF_UP)));
    }
}

