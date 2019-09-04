package com.pl.home_work_part_1;

import java.util.Scanner;

public class Ex7_Scor {
    public static void main(String[] args) {
        System.out.println("text");
        Scanner scan = new Scanner(System.in);

        while (!scan.hasNext("q!")) {
            String record = scan.nextLine();
            System.out.println(record.toUpperCase());
        }
    }
}
