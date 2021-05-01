package Lesson3;

public class the_equation {
    public static void main(String[] args) {
        double a = -5;
        double b = 55;
        double x;
        if (a==0 & b ==0 ) {
            System.out.println( "x" + " can be any number");
        }
        else if (a == 0){
            System.out.println( "the equation is not correct");

        }
        else if (b == 0 ) {
            System.out.println( "x" + " = 0");
        }

        else if (a != 0 & b != 0) {
            x = -b/a;
            System.out.println( "x = " + x );
        }
    }
}
