package main;

import java.util.Arrays;

public class Generics {


    public static void main(String[] args) {
//        testCase(new String[] { "Q", "W", "E", "R", "T", "Y" }, -1, 999);
//        testCase(new Integer[] { 1, 2, 3, 4, 5 }, 1, 2);
//        testCase(new String[] { "Q", "W", "E", "R", "T", "Y" }, 3, 5);

        try {
          Test test = create(Test.class);
        int c  = test.a + test.b;
            
            System.out.println(c);
        } catch (Exception e) {
        }
       
    }
    
//    private static <T> void testCase(T[] array, int indexFirst, int indexSecond) {
//        try {
//            changeElements(array, indexFirst, indexSecond);
//        System.out.println(Arrays.toString(array));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    private static <T> void changeElements(T[] array, int indexFirst, int indexSecond) throws Exception {
//        try {
//            T t = array[indexFirst];
//            array[indexFirst] = array[indexSecond];
//            array[indexSecond] = t;
//        } catch (Exception e) {
//            throw new Exception("incorrect index: first: " + indexFirst + "; last: " + indexSecond + "; length: " + array.length);
//        }
//    }
    

    private static <T> T create(Class<T> clazz) throws Exception {         
         return clazz.newInstance();
    }    
   
}
