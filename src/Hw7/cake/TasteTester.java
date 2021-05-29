package Hw7.cake;

public class TasteTester {
    public static void main(String[] args) {
    Cake cake = new Cake();
        cake.setTaste("chocolate");
        cake.setPrice(100);
        System.out.println("The cake costs " + cake.getPrice());
        System.out.println("Cake with " + cake.getTaste() + " taste");

    BirthdayCake birthdayCake = new BirthdayCake();
    birthdayCake.setCandles(25);
    birthdayCake.setTaste("cherry");
    birthdayCake.setPrice(99);
        System.out.println("Birthday Cake has " + birthdayCake.getCandles() + " candles");
        System.out.println("The cake costs " + birthdayCake.getPrice() );
        System.out.println("Cake with " + birthdayCake.getTaste() + " taste");

    WeddingCake weddingCake = new WeddingCake();
    weddingCake.setTiers(3);
    weddingCake.setTaste("vanilla");
    weddingCake.setPrice(500);
        System.out.println("Wedding Cake has " + weddingCake.getTiers() + " tiers" );
        System.out.println("The cake costs " + weddingCake.getPrice() );
        System.out.println("Cake with " + weddingCake.getTaste() + " taste");
}
    }