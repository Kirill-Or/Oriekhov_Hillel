package Lesson5;

public class Payroll {
    /*2 - Расчёт зарплаты агента по продажам
Расчёт зарплаты нужно разбить на несколько методов:
1. Первый метод получает количество отработанных часов и базовую ставку
если количество отработанных часов больше 160 то каждый последующий час
по коэф 1,5 (параметры у метода - входящие часы int, возвращаемое значение
double коэффициент)
2. Второй метод - получает коэффициент на базовые часы (которые до 160) в
зависимости от стажа работы (параметры у метода - стаж работы int,
возвращаемое значение double коэффициент)
до 2 лет 1
от 2 до 4 - 1.2
от 4 до 6 - 1.3
от 6 лет - 1.4
3. В зависимости от количества продаж - больше 20 - бонус 250, меньше 10
штраф 150 (параметры у метода - количество продаж int, возвращаемое
значение double бонус за количество продаж)
4. четвертый в зависимости от суммы продаж больше 15000 $ - тоже добавляется
бонус (параметры у метода - сумма продаж double, возвращаемое значение
double бонус за сумму продаж)
В методе main проинициализировать все нужные переменные, вызвать методы и
сделать расчет. Результат вывести в консоль
*/
    public static void main(String[] args) {
        int basicPerHour=1;
        int hour = 200;
        int experience = 1 ;
        int numberOfSales = 2;
        int salesAmount = 5000;

        double salary = ( overtimeBonus(hour) + (   basicPerHour * 160 * experienceCoefficient(experience)) +
                quantityBonus(numberOfSales)+ bonusForTheAmount(salesAmount));
        System.out.println("your salary is : " + salary);
    }

    static double overtimeBonus(int hour) {
        if (hour > 160)
         return ((hour - 160) * 1.5);
        else {
            return  0;
        }
    }
    static double experienceCoefficient (int years) {
        if (years < 2){
            return 1.0;
        }
        else if (years >=2 & years < 4) {
            return 1.2;
        }
        else if (years >=4 & years <6){
            return 1.3;
        }
        else
            return 1.4;
    }
    static double  quantityBonus (int number) {
        if (number > 20) {
            return 250;
        }
        else if (number < 10 ){
            return -150;
        }
        else
            return 0;

    }
    static double bonusForTheAmount (int amount){
        if (amount > 15000) {
            return 1000;
        }
        else
            return 0;
    }
}


