package Lesson4;

public class MinimumValueInAnArray {

    public static void main(String[] args) {
        double[] values = {5, 11, 12, 7, 9};
        double maxValue = values [0]; // счетчик мак сзачения

        for ( int i = 0 ;  i < values.length; i++) {
            double currentValue = values[i]; // текущее значение
                if (currentValue > maxValue){
                    maxValue = currentValue ; // если текущее больше, то заменяет счетчик
                }


        }
        System.out.println("Max value is " + maxValue );
    }
}
