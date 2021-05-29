package Hw7.juice;

public class Lemon extends Fruit {

    public Lemon() {
        setCalories(89);
    }

    public void peelLemon() {
        System.out.println("Now peeling Lemon");
    }


    @Override
    public void makeJuice() {
        System.out.println("Lemon juice is ready");
    }
}
