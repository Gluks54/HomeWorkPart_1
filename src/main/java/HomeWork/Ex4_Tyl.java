package HomeWork;

import java.util.Scanner;

public class Ex4_Tyl {
 public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Text");
        String n = scan.nextLine();

       char [] myCharArray = n.toCharArray ();// exchange String to Char

       for(int i = (myCharArray.length-1);i>=0;i-- ){
            System.out.print(myCharArray[i]);
        }
    }
}
