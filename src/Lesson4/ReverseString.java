package Lesson4;

public class ReverseString {
    public static void main(String[] args) {
        String inputString =  "Lesson4" ;
        char[] charArray = inputString.toCharArray();
        String reverseString = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            reverseString += charArray[i];

        }
        System.out.println( inputString +" on the contrary, will be "+ reverseString );
    }
}