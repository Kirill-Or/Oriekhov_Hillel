package Hw9;

import java.util.Scanner;

public class SumOfFiveNumbers {
    public static void main(String[] args) {
        double number;
        double sumOfNumbers = 0 ;

        for (int i = 0 ; i < 5 ; ) {
            System.out.println("Enter number");
           try {
               Scanner scanner = new Scanner(System.in);
               number = scanner.nextDouble();
               sumOfNumbers =sumOfNumbers + number;
               i++;
           } catch (Exception e) {
               System.out.println(" Please use double");
           }


        }
        System.out.println(sumOfNumbers  );

    }
}
