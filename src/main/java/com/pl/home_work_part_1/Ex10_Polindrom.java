package com.pl.home_work_part_1;

public class Ex10_Polindrom {
    public static void main(String[] args) {
        String nameA = "Kajak";
        String nameB = "kajak";

        StringBuilder builder = new StringBuilder(nameA);
        String reverse2 = builder.reverse().toString();

        Boolean rezult = reverse2.equals(nameB);
        System.out.println(rezult);
    }
}


