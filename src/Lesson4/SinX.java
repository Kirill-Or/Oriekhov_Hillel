package Lesson4;
//Написать программу, которая печатает значения sin(x), где x это каждые 10 градусов
//от 0 до 360.

 class SinX {

     public static void main(String[] args) {
         for (int i = 0; i >= 0 & i <= 360; i = i + 10) {
             double sinX = Math.sin( Math.toRadians( i ) );
             System.out.println( "sin " + i + " = " +  sinX );
         }
     }
 }