package main;

public class SimpleNumbers {


    public static void main(String[] args) {

            int number, dividers;
                   for (number = 2; number < 100; number++)
                   {
                       dividers = 0;
                       for (int i = 1; i <= number; i++)
                       {
                           if (number % i == 0)
                               dividers++;                           
                       }
                       
                       if (dividers <= 2)
                           System.out.println(number);
                   }
    }
}

