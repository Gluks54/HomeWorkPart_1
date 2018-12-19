package HomeWork;

import java.util.Scanner;

public class Ex1_2Sum_2 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("first number");
        int x = scan.nextInt();
        System.out.println("second number");
        int y = scan.nextInt();
        System.out.println(x + y);



    }

    public static class Runner {
        public static void main(String[] args) {
            int b = 5;
            int a = b; // 5
             // b = a;// 3
            System.out.println(a);
            System.out.println(b);
        }
    }
}
