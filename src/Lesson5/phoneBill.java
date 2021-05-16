package Lesson5;
/* Счет за телефон
Рассчитать стоимость пакета в месяц. Расчёт по каждому из параметров
сделать в отдельном методе. Потом общий подсчёт провести в методе main и вывести
в консоль c помощью sout
1. Стоимость интернета до 8гб включена в пакет, после 50 грн / 500 мб (вход
параметр кол-во потраченных гб)
2. Звонки по Украине до 500 минут 0,5 грн / мин после 0,75
3. Смс до 50 шт 1 грн после 1,50
4. Звонки за рубеж зона 1 1.5 грн/мин
5. Звонки за рубеж зона 2 2 грн/мин
После подсчёта суммы добавляется налог 7 % */
public class phoneBill {
    public static void main(String[] args) {
    int basicCost = 100;
    int spentGigabytes = 10;
    int spentMinutes = 500;
    int spentSMS = 20;
    int callsAbroadZoneOne= 5;
    int callsAbroadZoneTwo= 0;
    double totalCost = (basicCost + ((internetCost(spentGigabytes) + callsCost(spentMinutes) + SMSCost(spentSMS)
            + callsAbroadZoneOneCost(callsAbroadZoneOne) + callsAbroadZoneTwoCost( callsAbroadZoneTwo)  ) * 1.07) );
        System.out.println( "service package price is : " + totalCost);
    }
    static double internetCost (int Gb) {
        if (Gb > 8 ){
            return (((Gb - 8)/ 0.5) * 50);
        }
        else
            return 0;
    }
    static double callsCost (int minutes) {
        if (minutes > 500){
            return (((minutes - 500) * 0.75 ) + 250 );
        }
        else
            return (minutes * 0.5 );
    }
    static double SMSCost (int numberOfSms) {
        if (numberOfSms > 50 ){
            return (((numberOfSms - 50 ) *1.5) + 50);
        }
        else
            return (numberOfSms );
    }
    static double callsAbroadZoneOneCost (int minutes){
        return (minutes * 1.5);
    }
    static double  callsAbroadZoneTwoCost (int minutes){
        return  (minutes * 2 );
    }

}
