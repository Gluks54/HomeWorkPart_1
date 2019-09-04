package com.pl.home_work_part_1;

import java.util.Scanner;

public class Ex9_Gwiazda {
    public static void main(String[] args) {
        System.out.println("type number");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("***");
        for (int i = 3; i <= number; i++) {
            System.out.println("* *");
        }
        System.out.println("***");
    }
}
