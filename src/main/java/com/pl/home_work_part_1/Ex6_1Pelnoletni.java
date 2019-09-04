package HomeWork;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Ex6_1Pelnoletni {


    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        System.out.println("day");
        String n = scan.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date date1 = dateFormat.parse("15.05.2018");
        Date date2 = dateFormat.parse("17.05.2016");


        long c = date1.getTime() - date2.getTime();
        System.out.println(c);
        Date moment = new Date(76767870); // Задаем количество миллисекунд Unix-time с того-самого-момента
        moment.getTime();

       // Date objDate = new Date(); // Current System Date and time is assigned to objDate
        //if(objDate - date)
       // long milliseconds = date2 - date1;
        //long x = date2.getTime();
       // long y = date1.getTime();

        //long c =  x - y;
       // long d =  31536000000L;
        long years =  (c/ (365*24 * 60 * 60 * 1000));

       System.out.println(years);
    }
}