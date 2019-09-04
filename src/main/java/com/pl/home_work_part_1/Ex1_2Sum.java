package com.pl.home_work_part_1;

import java.util.Scanner;

public class Ex1_2Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Number");

        int numberFromUser = scan.nextInt();
        int initNumber = 0;

        for (int i = 1; i <= numberFromUser; i++) {
            if (i % 3 == 0) {
                initNumber = initNumber + i;
            }
            if (i % 5 == 0) {
                initNumber = initNumber + i;
            }
        }
        System.out.println(initNumber);
    }
}
