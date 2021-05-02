package Lesson3;

public class Sale_Advanced {
    /*1.Сумма покупки составляет а рублей. Если а больше 1000 рублей, то предоставляется
скидка 15%. Вывести на экран сумму покупки с учетом скидки либо сообщение о том,
что скидка не предоставляется*/
    public static void main(String[] args) {


        double priceBefore = 1000;
        double priceAfter ;
        if (priceBefore > 1000) {
            priceAfter = priceBefore * 0.85;
            System.out.println( " the price will be " + priceAfter + " rub " );
        }
        else {
            System.out.println("no discount provided");
        }

    }
}
