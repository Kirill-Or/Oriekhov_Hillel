package Lesson3;

public class Salary2 {
    /*Написать программу, которая выведет в консоль если количество продаж больше 10
сообщение что менеджер заработал бонус, если меньше, то выполнит расчёт сколько
осталось продаж до получения бонуса
*/
    public static void main(String[] args) {
        int sales = 12;
        int before_bonus;
        if (sales > 10) {
            System.out.println( "You have earned a bonus");
        }
        else {
            before_bonus = 11 - sales ;
            System.out.println( before_bonus + " sales before bonus ");
        }
    }
}
