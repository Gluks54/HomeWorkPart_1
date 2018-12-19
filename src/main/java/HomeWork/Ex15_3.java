package HomeWork;

import day_20_10_2018.List;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;

public class Ex15_3 {
    public static void main(String[] args) {
        Ex15_2 ex15_2 = new Ex15_2();
        ArrayList <String> stringList = new ArrayList<String>();
//находим значение для каждого номера 1 до 200 переводим в бинарную
        //форму и заносим в arraylist
        //
        for (int i = 0;i <=200; i++) {
            BigInteger rezult = ex15_2.fib(i);

            String strRez = rezult.toString(2);
            stringList.add(new String(strRez));
        }
        Ex15_fib_bin ex15_fib_bin = new Ex15_fib_bin();
        try {
            //print that crap
            ex15_fib_bin.draw(stringList);
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
