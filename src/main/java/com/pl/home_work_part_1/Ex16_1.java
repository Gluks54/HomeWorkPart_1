package com.pl.home_work_part_1;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ex16_1 {
    public String add(String a, String b) {
        StringBuilder first = new StringBuilder(a);
        StringBuilder second = new StringBuilder(b);
        return first.append(b).toString();
    }

    public String sub(String a, String b) {
        char[] first = a.toCharArray();
        char[] second = b.toCharArray();

        for (int i = 0; i <= (second.length - 1); i++) {

            char[] temp = remove(first, second[i]);
            first = temp;
        }
        return new String(first);
    }

    public char[] remove(char[] a, char b) {
        for (int i = (a.length - 1); i >= 0; i--) {
            if (a[i] == b) {
                while (i <= (a.length - 2)) {
                    a[i] = a[i + 1];
                    i++;
                }
                char[] newA = new char[a.length - 1];
                for (int x = 0; x <= a.length - 2; x++) {
                    newA[x] = a[x];
                }
                return newA;
            }
        }
        return a;
    }

    public String sub_m(String a, String b) {
        return sub(b, a);
    }

    public String uniq(String a) {
        Set<Character> set = new LinkedHashSet<>();
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<Character> itr = set.iterator();

        char[] arCar = a.toCharArray();
        for (int i = 0; i <= (arCar.length - 1); i++) {
            char temp = arCar[i];
            set.add(temp);
        }
        while (itr.hasNext()) {
            char temp2 = itr.next();
            stringBuffer.append(temp2);

        }
        return stringBuffer.toString();
    }

    public String inter(String a, String b) {
        StringBuffer stringBuffer = new StringBuffer();
        char[] first = a.toCharArray();
        char[] second = b.toCharArray();
        for (Character i : second) {
            stringBuffer.append(fouLet(first, i));
        }
        return stringBuffer.toString();
    }

    public String fouLet(char[] first, char b) {

        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i <= (first.length - 1); i++) {
            if (first[i] == b) {
                first[i] = '*';
                stringBuffer.append(b);
                b = '*';
            }
        }
        return stringBuffer.toString();
    }
}


