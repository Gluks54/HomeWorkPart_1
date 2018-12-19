package HomeWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex8_Arg_wyjsc {
    //run ->edit configurations -> program arfuments;
    public static void main(String[] args) {

        String inArguments = args[0];
        String[] tablString = inArguments.split("\\,"); // razbivaem n tablicu strinfov
//        // wypisze wszystkie liczby w kolejności w jakiej zostały podane
//        for (int i = 0;i < tablString.length;i++){
//             int intOut = Integer.parseInt(tablString[i]);  // perevodim stringi v int
//            System.out.println(intOut);
//        }

        //wypisze wszystkie liczby od tyłu
//        int size = tablString.length;
//         for (int i = (size - 1);i >= 0;i--){
//             int intOut = Integer.parseInt(tablString[i]);
//             System.out.println(intOut);
//         }
        //wypisze wszystkie na nieparzystych pozycjach
//        for (int i = 0;i < tablString.length ;i++){
//            if(i%2 != 0 ){
//                int intOut = Integer.parseInt(tablString[i]);  // perevodim stringi v int
//                System.out.println(intOut);
//            }
//        }

        //wypisze wszystkie podzielne przez 3
//        for (int i = 0;i < tablString.length;i++){
//            double c;
//             double intOut = Integer.parseInt(tablString[i]);  // perevodim stringi v int
//            c = intOut/3;
//            System.out.println(c);
//        }

        //wypisze sumę wszystkich
//        int b = 0;
//        for (int i = 0;i < tablString.length;i++){
//            int intOut = Integer.parseInt(tablString[i]);  // perevodim stringi v int
//            b = intOut + b;
//        }
//        System.out.println(b);


        //wypisze sumę pierwszych 4
//        double b = 0;
//        for (int i = 0;i < 4;i++){
//            double intOut = Integer.parseInt(tablString[i]);  // perevodim stringi v int
//            b = intOut + b;
//        }
//        System.out.println(b);

        //wypisze sumę ostatnich 5 liczb które są większe niż 2
//         double b = 0;
//        int size = tablString.length;
//        for (int i = (size - 1);i >= (size - 5);i--){
//            double intOut = Integer.parseInt(tablString[i]);  // perevodim stringi v int
//            if(intOut > 2) {
//                b = intOut + b;
//            }
//        }
//        System.ou

        //wypisze sumę liczb od początku tablicy która przekracza 10 (in: "1 2 3 5 6 7 10 100 123" out: "11")
//        int b = 0;
//        for (int i = 0; i < tablString.length; i++) {
//            int intOut = Integer.parseInt(tablString[i]);  // perevodim stringi v int
//            b = intOut + b;
//            if (b > 10) {
//                break;
//            }
//        }
//        System.out.println(b);


        //(zadanie domowe) wybierz liczby z tablicy tak by ich
        // suma była jak najbliższa 10, wypisz te liczby






//        String a = "2,3,2";
//        String [] b = a.split("\\s*(\\s|,|!|\\.)\\s*");
        // \s*(\s|,|!|\.)\s*
        // String i3 = Integer.parseInt(b);
        // System.out.println(b);
//            for (String i:b) {
//                int b = Integer.parseInt();
//                System.out.println(b);
//            }
        // for (int i = 0;i < args.length;i++){
        //    System.out.println(c);
        // }
//        int i3 = 0;
//        String str2 = "102944";
//        try {
//            i3 = Integer.parseInt(str2);
//            System.out.println(i3);
//        } catch (NumberFormatException e) {
//            System.err.println("Неверный формат строки!");
//        }
//
//        String text = "1,0,2,9,4,4";
//        String[] words = text.split("\\,");
//        for(String word : words){
//            System.out.println(word);
//        }

//        // na 3 sovpadenii
//        String input = "29,Alla,Treffry,atreffrys@livejournal.com,Female,222.5.224.50,98,66104938165";
//        Pattern pattern = Pattern.compile(",[a-zA-Z]{2,}");
//        Matcher matcher = pattern.matcher(input);
//        int i = 0;
//        while (matcher.find()){
//            i++;
//            if (i == 3){
//                System.out.print(matcher.group());
//            }
//        }

//        while(matcher.find())
//            System.out.print(matcher.group());
    }
}