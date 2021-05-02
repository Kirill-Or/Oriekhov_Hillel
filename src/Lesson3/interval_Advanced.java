package Lesson3;



public class interval_Advanced {
    //Проверить, принадлежит ли число введенное с клавиатуры, интервалу (-5;3)
    public static void main(String[] args) {
        int a = -4 ;
        if ( -5<a & a < 3 ) {
            System.out.println( "number " + a + " belongs to interval (-5;3)");
        }
         else   {
            System.out.println("number " + a + " doesn't belongs to interval (-5;3)") ;
         }
    }

}
