package main;

import java.util.Arrays;
import java.util.Scanner;

public class XOX {

    public static void main(String[] args) {
        int i, j;
        int val = 50;

        String arr[][] = new String[val][val];

        for (i = 1; i < arr.length / 2 + 1; i++) {
            for (j = 0; j < arr[i].length; j++) {
                if ((j < i) || (j >= (arr[i].length - i))) {
                    arr[i - 1][j] = "X";

                } else
                    arr[i - 1][j] = "O";
            }

        }
        for (i = arr.length - 2; i >= arr.length / 2; i--) {
            for (j = 0; j < arr[i].length; j++) {
                if ((j < (arr[i].length - 1 - i)) || (j > i)) {
                    arr[i][j] = "X";
                    arr[i + 1][j] = arr[i][j];
                } else {
                    arr[i][j] = "O";
                    arr[i + 1][j] = arr[i][j];
                }

                arr[arr.length / 2][j] = "X";

            }
        }

        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

}
