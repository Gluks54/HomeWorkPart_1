package com.pl.home_work_part_1;

import java.util.Scanner;

public class Ex3_Silnia {
    public static void main(String[] args) {
        System.out.println(" number");
        Scanner scan = new Scanner(System.in);

        System.out.println(" number2");
        int numberFromUser = scan.nextInt();
        int rezult = fact(numberFromUser);
    }

    public static int fact(int x) {
        int result;

        if (x == 1) {
            return 1;
        } else {
            result = fact(x - 1) * x;
            return result;
        }
    }
}

