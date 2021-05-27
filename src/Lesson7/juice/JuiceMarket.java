package Lesson7.juice;

public class JuiceMarket {
    public static void main(String[] args) {
        Apple apple = new Apple();
        System.out.println(apple.getCalories());
        apple.removeSeeds();
        apple.makeJuice();

        Banana banana = new Banana();
        System.out.println(banana.getCalories());
        banana.peelBanana();
        banana.makeJuice();

        Orange orange = new Orange();
        System.out.println(orange.getCalories());
        orange.peelOrange();
        orange.makeJuice();

        Lemon lemon = new Lemon();
        System.out.println(lemon.getCalories());
        lemon.peelLemon();
        lemon.makeJuice();
    }
}