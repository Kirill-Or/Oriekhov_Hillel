package Lesson3;

public class divisor_Advanced {
    //Определить, является ли число а делителем числа b
    public static void main(String[] args) {
        double b= 30;
        double a= 6;
        if (b % a == 0 ) {
            System.out.println(a + "  is a divisor of " + b );

        }
        else {
            System.out.println(a + " a is not a divisor of " + b);
        }




    }
}
