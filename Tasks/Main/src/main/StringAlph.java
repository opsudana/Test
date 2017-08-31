package main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class StringAlph {

    public static void main(String[] args) {

        String alph =
            "Дана строка, содержащая текст на русском языке. Составить в алфавитном порядке список всех слов, встречающихся в этом тексте.";
        String[] splitted = alph.split(" ");
        Arrays.sort(splitted, new SortedByAlph());
        System.out.println(Arrays.toString(splitted).replaceAll(","  , ""));
    }


}
