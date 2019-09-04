package com.pl.home_work_part_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Ex17_Anagram {
    public static void main(String[] args) throws IOException {
        int counter = 0;

        Path path = Paths.get("C:\\Users\\AguRok\\IdeaProjects\\prog_1\\angram.txt");

        List<String> anagramList = Files.readAllLines(path);
        List<String> lineWithS =
                anagramList
                        .stream()
                        .filter(x -> filtS(x))
                        .map(x -> catFunc(x))
                        .collect(Collectors.toList());

        List<String> justLine = anagramList
                .stream()
                .filter(x -> !filtS(x))
                .collect(Collectors.toList());

        for (int x = 0; x <= (lineWithS.size() - 1); x++) {

            for (int y = 0; y <= (justLine.size() - 1); y++) {
                boolean temp = Ex17_Anagram.anagram(lineWithS.get(x), justLine.get(y));
                if (temp) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }

    public static String catFunc(String temp) {
        char[] charArr = temp.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i <= (charArr.length - 3); i++) {
            stringBuffer.append(charArr[i]);
        }
        return stringBuffer.toString();
    }

    public static boolean filtS(String temp) {
        char[] charTable = temp.toCharArray();
        if (charTable.length > 2) {
            if (!Character.isLetter(charTable[charTable.length - 2])) {
                return true;
            }
        }
        return false;
    }

    public static boolean anagram(String first, String second) {
        if (first.length() == second.length()) {

            String upFirst = first.toUpperCase();
            String upSecond = second.toUpperCase();

            char[] tabFirst = upFirst.toCharArray();
            char[] tabSecond = upSecond.toCharArray();

            ArrayList<Character> listFirst = new ArrayList<>();
            ArrayList<Character> listSecond = new ArrayList<>();

            for (int i = 0; i <= (tabFirst.length - 1); i++) {
                listFirst.add(tabFirst[i]);
                listSecond.add(tabSecond[i]);
            }

            Collections.sort(listFirst);
            Collections.sort(listSecond);

            StringBuffer buffFirst = new StringBuffer();
            StringBuffer buffSecond = new StringBuffer();

            listFirst
                    .stream()
                    .forEach(x -> buffFirst.append(x));

            listSecond
                    .stream()
                    .forEach(x -> buffSecond.append(x));

            String endFirst = buffFirst.toString();
            String endSecond = buffSecond.toString();

            if (endFirst.equals(endSecond)) {
                System.out.println(first + "--" + second);
            }

            return endFirst.equals(endSecond);
        } else {
            return false;
        }
    }
}
