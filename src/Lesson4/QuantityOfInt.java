package Lesson4;

public class QuantityOfInt {
    public static void main(String[] args){
    /*Написать программу, которая подсчитывает количество элементов массива int*ов,
    которые делятся на 2, но не делятся на 3 и выводит в консоль*/
        double[] values = {2 ,4 ,6 , 9, 12 };
        int counter = 0;
        for (int i = 0; i <= values.length -1 ; i++) {
            if (values[i] % 2 == 0 & values[i] % 3 != 0) {
            counter += 1;
            }
        }
        System.out.println( counter + " numbers are divisible by 2 and not divisible by 3 ");
    }

}
