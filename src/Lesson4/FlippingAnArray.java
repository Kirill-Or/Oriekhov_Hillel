package Lesson4;
//Написать программу, который переворачивает массив
public class FlippingAnArray {
    public static void main(String[] args) {
        int [] massive = { 2, 3, 5 ,7, 11};
        int x = massive.length;
        int a;
        for (int i=0 ; i< massive.length /2  ; i++ ){
          a = massive [ x - i - 1];
            massive [ x - i - 1] = massive [i];
            massive [i] = a;



        }
        for (int i = 0; i < massive.length; i++)
        System.out.print( massive[i] + ", " );
    }
}
