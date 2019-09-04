package HomeWork;

import java.math.BigDecimal;
import java.math.BigInteger;

import static java.math.BigDecimal.*;
import static java.math.BigDecimal.ROUND_CEILING;
import static java.math.BigDecimal.valueOf;

public class Ex11_Fibonachi {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(1.00);
        BigDecimal b = new BigDecimal(1.00);
        BigDecimal c = new BigDecimal(1.00); //not null because NullpointerException

     //   BigDecimal g = new BigDecimal(10.00);
//convert BigDecimal to int and take binary number
//        int ff = 0;
//        ff = g.toBigInteger().intValue();
//        System.out.println(Integer.toBinaryString(ff));

        for(int i = 0;i <=10;i++) {

            c =  a.add(b);
            System.out.println(c +" binary number = "+ Integer.toBinaryString(c.toBigInteger().intValue()) +" Stosunek -" + (c.divide(b,8,BigDecimal.ROUND_HALF_UP )));


            a =  c.add(b);
            System.out.println(a +" binary number = "+ Integer.toBinaryString(a.toBigInteger().intValue()) + " Stosunek -" + (a.divide(c,8,BigDecimal.ROUND_HALF_UP)));

            b =  a.add(c); }
             System.out.println(b +" binary number = "+ Integer.toBinaryString(b.toBigInteger().intValue()) + " Stosunek -" + (b.divide(a,8,BigDecimal.ROUND_HALF_UP)));

/////////////////////////////////////////////////////////////////////////////
//            BigDecimal a = new BigDecimal(1.00);
//        BigDecimal b = new BigDecimal(1.00);
//        BigDecimal c = new BigDecimal(1.00); //not null because NullpointerException
//
//        for(int i = 0;i <=10;i++) {
//
//            c =  a.add(b);
//            System.out.println(c + " Stosunek -" + (c.divide(b,8,BigDecimal.ROUND_HALF_UP)));
//
//            a =  c.add(b);
//            System.out.println(a + " Stosunek -" + (a.divide(c,8,BigDecimal.ROUND_HALF_UP)));
//
//            b =  a.add(c); }
//             System.out.println(b + " Stosunek -" + (b.divide(a,8,BigDecimal.ROUND_HALF_UP)));
/////////////////////////////////////////////////////////////////////////////
//        BigDecimal a = new BigDecimal(1.00);
//        BigDecimal b = new BigDecimal(1.00);
//        BigDecimal c = new BigDecimal(1.00); //not null because NullpointerException
//
//        for(int i = 0;i <=10;i++) {
//
//            c =  a.add(b);
//            System.out.println(c + " Stosunek -" + (c.divide(b,8,BigDecimal.ROUND_HALF_UP)));
//
//            a =  c.add(b);
//            System.out.println(a + " Stosunek -" + (a.divide(c,8,BigDecimal.ROUND_HALF_UP)));
//
//            b =  a.add(c); }
//             System.out.println(b + " Stosunek -" + (b.divide(a,8,BigDecimal.ROUND_HALF_UP)));
///////////////////////////////////////////////////////////////////
        //simple Fibonachi
//        long a = 1;
//        long b = 1;
//        long c = 0;

//        for(int i = 0;i <=100;i++) {
//            System.out.println(c + " Stosunek -" +(c/b) );
//            c = a + b;
//            System.out.println(a + " Stosunek -" +(a/c));
//            a = c + b;
//            System.out.println(b + " Stosunek -" +(b/a));
//            b = a + c;
//
      }

    }

