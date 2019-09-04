package com.pl.home_work_part_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex6_1Pelnoletni {


    public static void main(String[] args) throws ParseException {
        System.out.println("day");

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date date1 = dateFormat.parse("15.05.2018");
        Date date2 = dateFormat.parse("17.05.2016");

        long rezult = date1.getTime() - date2.getTime();
        System.out.println(rezult);
        Date moment = new Date(76767870);
        moment.getTime();

        long years = (rezult / (365 * 24 * 60 * 60 * 1000));

        System.out.println(years);
    }
}
