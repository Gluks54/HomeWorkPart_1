package day_20_10_2018;

import com.sun.javaws.exceptions.InvalidArgumentException;

public class App {
    public static void main(String[] args) throws InvalidArgumentException {
        SdaList list = new List();
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);

        list.removeAt(1);

        //list.removeLast();

        //System.out.println(list.getLast());

        //list.clear();
        //System.out.println(((List) list).head.value);

        //list.setAt(3,12);
        //list.addAt(1,10);

        //6543 addFirst
        //3456 addLast
       System.out.println(list.get(0));
       System.out.println(list.get(1));
       System.out.println(list.get(2));
       //System.out.println(list.get(3));
      // System.out.println(list.get(4));
        }


    }

