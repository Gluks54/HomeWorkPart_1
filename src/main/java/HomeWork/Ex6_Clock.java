package HomeWork;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex6_Clock {
    public static void main(String[] args) {
        try {
            // создаем формат, в котором будем парсить дату
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            Scanner scan = new Scanner(System.in);

            System.out.println("day");
            //String n = scan.nextLine();
            String string = scan.nextLine();

            Date now = dateFormat.parse("20.10.2018");
            Date date2 = dateFormat.parse(string);

            System.out.println("Первая дата: " + now);
            System.out.println("Вторая дата: " + date2);

            long milliseconds = now.getTime() - date2.getTime() ;
            System.out.println("\nРазница между датами в миллисекундах: " + milliseconds);

            // 1000 миллисекунд = 1 секунда
            int seconds = (int) (milliseconds / (1000));
            System.out.println("Разница между датами в секундах: " + seconds);

            // 60 000 миллисекунд = 60 секунд = 1 минута
            int minutes = (int) (seconds / (60));
            System.out.println("Разница между датами в минутах: " + minutes);

            // 3 600 секунд = 60 минут = 1 час
            int hours = (int) (minutes / (60));
            System.out.println("Разница между датами в часах: " + hours);

            // 24 часа = 1 440 минут = 1 день
            int days = (int) (hours / (365*24));
            System.out.println("Разница между датами в днях: " + days);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
