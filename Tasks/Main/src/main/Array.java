package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        Integer[] arr = { 2, -6, 5, 3, -1, 9, 7 };
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;

                }
            }
        }

        System.out.println(Arrays.toString(arr));
        for (int s = 0; s < arr.length; s++) {
        
        }
        
//        ArrayList<Integer> array = new ArrayList<Integer>();
//        for(int k = 0; k < arr.length; k++){
//            if (arr[k] > 0) array.add(arr[k]);
//        }
        List<Integer> array = Arrays.asList(arr);
        Iterator<Integer> iter = array.iterator();
        while (iter.hasNext()) {
            Integer value = iter.next(); 
              if (value < 0)  array.remove(value);
            }
            System.out.println(array);
        }
        

    }



