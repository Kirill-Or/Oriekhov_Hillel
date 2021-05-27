package Lesson7.juice;

public class Orange extends Fruit {


    public Orange() {
        setCalories(59);
    }



    public void peelOrange() {
        System.out.println("Now peeling Orange ");
    }



    @Override
    public void makeJuice() {
        System.out.println("Orange juice is ready");
    }
}

