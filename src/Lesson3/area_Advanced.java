package Lesson3;

public class area_Advanced {
    /*Известны площади круга и квадрата. Определить: уместится ли круг в квадрате
    уместится ли квадрат в круге
    */
    public static void main(String[] args) {
        double S_circle = 40;
        double S_square = 9;
        double D_circle;
        double D_square;
        double a_square;
        D_square = Math.sqrt(2 * S_square);
        D_circle = 2 * (Math.sqrt(S_circle / Math.PI));
        a_square = Math.sqrt(S_square);
         if (D_circle <= a_square ) {
             System.out.println( "the circle will fit into the square"
             );
         }
         if (D_square <= D_circle ) {
             System.out.println("The square will fit into the circle");
         }


    }

}




