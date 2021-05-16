package Lesson5;

public class FlippingAnArrayTwoMethods {
    /*1 - Написать метод (void) который переворачивает массив. В main должен быть вызван
метод который переворачивает массив, потом вывести с помощью sout. Важно - не
вывести в консоль с последнего элемента, а проапдейтить существующий массив с
помощью void*/
    public static void main(String[] args) {
        int[] array = {4, 12, 5, 1, 10};
        flippingAnArray(array);
        for (int i = 0; i < array.length; i++)
            System.out.print( array[i] + ", " );

    }

    static void flippingAnArray(int[] number) {
        int x = number.length;
        int a;
        for (int i = 0; i < number.length / 2; i++) {
            a = number[x - i - 1];
            number[x - i - 1] = number[i];
            number[i] = a;

        }
    }
}