package HomeWork;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex17_Anagram {


    public static void main(String[] args)throws IOException {
        int counter = 0;
        //System.out.println(Ex17_Anagram.anagram("anna","annb"));

        Path path = Paths.get("C:\\Users\\AguRok\\IdeaProjects\\prog_1\\angram.txt");

        List<String> anagramList = Files.readAllLines(path);
    //found word with 's and cut that
        List<String> lineWithS =
                anagramList
                .stream()
                .filter(x->filtS(x))
                .map(x->catFunc(x))
                .collect(Collectors.toList());
       // System.out.print(lineWithS);

        //fount word without 's
        List<String> justLine = anagramList
                .stream()
                .filter(x->!filtS(x))
                .collect(Collectors.toList());
      //  System.out.print(line);
    for(int x = 0;x <= (lineWithS.size() - 1);x++){

        for(int y = 0; y <= (justLine.size() -1); y++){
           boolean temp = Ex17_Anagram.anagram(lineWithS.get(x),justLine.get(y));
           if (temp){
               counter ++;
           }
        }
    }
        System.out.println(counter);
}

//        String  wordFirst = anagramList.get(0);
//        String wordSecond = anagramList.get(1);
//        System.out.println(Ex17_Anagram.anagram(wordFirst,wordSecond));
//
//
// Scanner scan = new Scanner(path);
//        String  strings = scan.nextLine(path);
//        System.out.println(strings);

    public static String catFunc(String temp){
        char [] charArr = temp.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();

        for(int i = 0;i <= (charArr.length - 3);i++){
            stringBuffer.append(charArr[i]);
        }

        return stringBuffer.toString();
    }



    public static boolean filtS(String temp){


        char [] charTable = temp.toCharArray();
       // if(charTable[(charTable.length -1)] == 's'){
        if(charTable.length>2){
            if(!Character.isLetter(charTable[charTable.length - 2])) {
                return true;
            } }
        return false;
    }


    public static boolean anagram(String first, String second){

        //firstly we check lengh both words
        if (first.length() == second.length()) {

            String upFirst = first.toUpperCase();
            String upSecond = second.toUpperCase();

            char[] tabFirst = upFirst.toCharArray();
            char[] tabSecond = upSecond.toCharArray();

            ArrayList<Character> listFirst = new ArrayList<>();
            ArrayList<Character> listSecond = new ArrayList<>();

            //add to ArrayList
            for (int i = 0; i <= (tabFirst.length - 1); i++) {
                listFirst.add(tabFirst[i]);
                listSecond.add(tabSecond[i]);
            }
            //sort words
            Collections.sort(listFirst);
            Collections.sort(listSecond);

            //compare sort word
            StringBuffer buffFirst = new StringBuffer();
            StringBuffer buffSecond = new StringBuffer();

            //add to Buffer
            listFirst
                    .stream()
                    .forEach(x -> buffFirst.append(x));

            listSecond
                    .stream()
                    .forEach(x -> buffSecond.append(x));

            String endFirst = buffFirst.toString();
            String endSecond = buffSecond.toString();

            if(endFirst.equals(endSecond)){
                System.out.println(first + "--" + second);
            }

            return endFirst.equals(endSecond);
        }else {return false;}
    }

}
