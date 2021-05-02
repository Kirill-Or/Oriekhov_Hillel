package Lesson3;
/*7. Написать программу, для расчёта зарплаты менеджера по продажам. Если
менеджер совершил более 10 продаж он получает бонус 250$. Базовая ставка 1000$.
*/
public class Salary {
    public static void main(String[] args) {
        int salary= 1000;
        int sales = 5;
            if (sales > 10) {
                salary += 250;
            }
        System.out.println( "Your salary is " + salary );

    }
}
