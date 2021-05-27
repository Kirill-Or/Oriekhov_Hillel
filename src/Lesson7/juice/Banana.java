package Lesson7.juice;

public class Banana extends Fruit {

    public Banana() {
        setCalories(90);
    }

    public void peelBanana() {
        System.out.println("Now peeling banana");
    }


    @Override
    public void makeJuice() {
        System.out.println("Banana juice is ready");
    }
}