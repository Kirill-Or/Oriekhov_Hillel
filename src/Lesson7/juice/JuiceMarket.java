package Lesson7.juice;

public class JuiceMarket {
    public static void main(String[] args) {
        Apple apple = new Apple();
        System.out.println("Apple has " + apple.getCalories() + " calories ");
        apple.removeSeeds();
        apple.makeJuice();

        Banana banana = new Banana();
        System.out.println("Banana has " + banana.getCalories()+ " calories" );
        banana.peelBanana();
        banana.makeJuice();

        Orange orange = new Orange();
        System.out.println("Orange has " + orange.getCalories() +  " calories");
        orange.peelOrange();
        orange.makeJuice();

        Lemon lemon = new Lemon();
        System.out.println("Lemon has " + lemon.getCalories() + " calories");
        lemon.peelLemon();
        lemon.makeJuice();
    }
}