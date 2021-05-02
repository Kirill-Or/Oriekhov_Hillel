package Lesson3;

public class mortgage {
    /*Получение ипотеки
Имеем 2 переменные - возраст мужа и жены
Написать программу, которая выводит в консоль результат.
Задачу решить используя вложенный if (сначала проверить возраст жены, потом мужа)*/

    public static void main(String[] args) {
        int man = 40;
        int women = 20;
        if (women < 35) {
            if (man < 35) {
                System.out.println("mortgage approved");
            } else {
                System.out.println("mortgage declined");
            }
        } else {
            System.out.println("mortgage declined");
        }
    }

}