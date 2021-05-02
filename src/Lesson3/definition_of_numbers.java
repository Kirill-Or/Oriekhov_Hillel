package Lesson3;

public class definition_of_numbers {
    /*Даны три различных числа. Определить, какое из них (первое, второе или третье) -
самое большое - самое маленькое - является средним*/
    public static void main(String[] args) {


        int a = 5;
        int b = 10;
        int c = 10;
        if (a > b & a > c)
            if (b > c) {
                System.out.println(a + " Max " + c + " Min " + b + " average"); }
            else if (c > b) {
                System.out.println(a + " Max " + b + " Min " + c + " average"); }
            else {}
        else if (b > a & b > c)
            if (a > c) {
                    System.out.println(b + " Max " + c + " Min " + a + " average"); }
            else if (c > a) {
                    System.out.println(b + " Max " + a + " Min " + c + " average"); }
            else {}
        else if (c > a & c > b)
            if (a > b)
                        System.out.println(c + " Max " + b + " Min " + a + " average");
            else if (b > a) {
                        System.out.println(c + " Max " + a + " Min " + b + " average");
                    }
            else {}
    }
}
