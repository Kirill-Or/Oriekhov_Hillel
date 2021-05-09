package Lesson4;
// Написать программу, которая находит минимальное значение в массиве
public class MinimumValueInAnArray {

    public static void main(String[] args) {
        double[] values = {5, 11, 12, 3, 9};
        double maximumValue = values [0]; // счетчик мак сзачения

        for ( int i = 0 ;  i < values.length; i++) {
            double currentValue = values[i]; // текущее значение
                if (currentValue < maximumValue){
                    maximumValue = currentValue ; // если текущее меньше, то заменяет счетчик
                }


        }
        System.out.println("Minimum value is " + maximumValue );
    }
}
