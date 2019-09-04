package com.pl.home_work_part_1;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;

public class Ex15_3 {
    public static void main(String[] args) {
        Ex15_2 ex15_2 = new Ex15_2();
        ArrayList<String> stringList = new ArrayList<String>();

        for (int i = 0; i <= 200; i++) {
            BigInteger rezult = ex15_2.fib(i);

            String strRez = rezult.toString(2);
            stringList.add(new String(strRez));
        }
        Ex15_fib_bin ex15_fib_bin = new Ex15_fib_bin();
        try {

            ex15_fib_bin.draw(stringList);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
