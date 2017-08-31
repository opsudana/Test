package main;

public class Exc {
    public static int getFactorial(int num) throws EcxeptionsDemo {

        int result = 1;
        if (num < 1)
            throw new EcxeptionsDemo("Число не может быть меньше 1", num);
        

        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {

        try {
            int result = Exc.getFactorial(0);
            System.out.println(result);
        } catch (EcxeptionsDemo ex) {

            System.out.println(ex.getMessage());
            System.out.println(ex.getNumber());
        }
    }

}
