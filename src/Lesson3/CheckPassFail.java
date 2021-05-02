package Lesson3;
/*Написать программу с названием “CheckPassFail”, которая выводит PASS если
переменная “mark” типа int больше или равно 50 или вывести “FAIL” в противном
случае. Программа всегда должна перед выходом печатать “DONE”
*/
public class CheckPassFail {
    public static void main(String[] args) {
        int mark = 51;
        if (mark >= 50) {
            System.out.println("Pass");
    }
        else {
            System.out.println("Fail");
        }
    System.out.println( "Done");
    }
}
