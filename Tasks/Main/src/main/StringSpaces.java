package main;

import java.util.Arrays;

public class StringSpaces {   
   
    public static void main(String[] args) {
        
        String spaces =
            " В начале лишний пробел. Между этим      и       этим словами лишние пробелы. И вот тут в конце еще лишний. ";
        String delspace = spaces.replaceAll("[\\s]{2,}", " ");
        StringBuilder result = new StringBuilder(delspace);
        System.out.println(result.toString().trim());
    }
}
