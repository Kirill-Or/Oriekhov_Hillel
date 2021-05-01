package Lesson3;

public class greatest_value {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;
            if ( a > b ) {
            System.out.println( "The number "+ a + " has the greatest value");
        }
            else if (b > a ) {
                System.out.println("The number " + b + " has the greatest value");
            }
            else if (a == b ) {
                System.out.println(a + " and " + b + " are equal");
            }
            else  {
                System.out.println( "Not a valid data");
            }
    }

}
