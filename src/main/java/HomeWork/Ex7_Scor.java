package HomeWork;

import java.io.InputStream;
import java.util.Scanner;
public class Ex7_Scor {

    public static void main(String[] args) {

        //Big letters
        System.out.println("text");
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNext("q!")){
            String record = scan.nextLine();
            System.out.println(record.toUpperCase());
        }



    }
}
