package HomeWork;

import java.util.Scanner;

public class Ex3_Silnia {
    public static void main(String[] args) {
        System.out.println(" number");
        Scanner scan = new Scanner(System.in);
       /* int  n = scan.nextInt();
        int c =1;
        for(int i = 1;(n-i)>=0;n--){
           c = c*n;
        }
        System.out.println(c);*/

        System.out.println(" number2");
        int  x = scan.nextInt();
        int r = fact(x);
    }

    public  static int  fact (int x) {
        int result;

        if(x == 1){
            return 1;
        }
        else{
            result = fact(x - 1) * x;
            return result;
        }





    }
}

