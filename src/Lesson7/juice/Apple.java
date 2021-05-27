package Lesson7.juice;

public class Apple extends  Fruit{
    public Apple() {
     setCalories(59);
    }

    public void removeSeeds(){
        System.out.println("Apple pits are now being removed");
    }



    @Override
    public void makeJuice () {
        System.out.println("Apple juice is ready");

    }
}
