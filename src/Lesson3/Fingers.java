package Lesson3;

public class Fingers {
    /*Написать метод, используя switch, который принимает в себя номер пальца -
переменную типа int и в зависимости от номер выводит название пальца (1-”большой”
и т д)*/

    public static void main(String[] args) {
        int number = 22;
        switch (number) {
            case 1:
                System.out.println("thumb");
                break;
            case 2:
                System.out.println(" index finger ");
                break;
            case 3:
                System.out.println( " middle finger ");
                break;
            case 4:
                System.out.println("ring finger");
                break;
            case 5:
                System.out.println("pinky");
                break;
            default:
                System.out.println("enter finger number");










        }
    }




}
