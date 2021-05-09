package Lesson4;
//. Написать программу, которая проверяет является ли строка палиндромом
//(используя массив char)
public class Palindrome {
    public static void main(String[] args) {
        String inputString = "dohod";
        int x = inputString.length();
        boolean Palindrome = true;
        for ( int i= 0 ; i < (inputString.length()/ 2 ); i++ ){
            char [] arrayOfChar = inputString.toCharArray();
                if ( arrayOfChar[i]  !=  arrayOfChar [x -(i + 1)]       ){
                    Palindrome = false;
                    break;

                }
        }
        System.out.println( "is "+ inputString + " palindrome : " + Palindrome );
    }



}
