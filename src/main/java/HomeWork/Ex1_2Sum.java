package HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1_2Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Number");
        int n = scan.nextInt();
        int c =0;
        List<Integer> numbers = new ArrayList<Integer>();

            for (int i = 1;i <=n;i++){

                if (i%3 == 0){

                    c = c +i;
                   // animals.add(i);
                }
                if (i%5 == 0){
                  //  animals.add(i);
                    c = c + i;
                }
            }
           // int sum = numbers.stream().mapToInt(x -> x).sum();
        System.out.println(c);
    }
}
