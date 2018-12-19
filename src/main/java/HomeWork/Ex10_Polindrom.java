package HomeWork;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex10_Polindrom {
    public static void main(String[] args) {
        String nameA = "Kajak";
        String nameB = "kajak";

        StringBuilder builder = new StringBuilder(nameA);
        String reverse2 = builder.reverse().toString();

        Boolean rezult = reverse2.equals(nameB);
        System.out.println( rezult);

    }
}


