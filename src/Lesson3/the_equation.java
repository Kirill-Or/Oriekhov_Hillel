package Lesson3;
/*Написать программу, которая бы решала уравнение вида a*x + b = 0 Переменные a
и b можно задать вручную. Далее нужно будет посчитать и вывести значение “х”.
Программа должна также учитывать варианты, когда или а = 0 или b = 0
*/
public class the_equation {
    public static void main(String[] args) {
        double a = 25;
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
