package Hw10;

import java.util.Arrays;

public class OperationWithString {
     String string = "Get a modern feel with a smudge-resistant only for $2.50, you can finish now";
     int x = string.length();

    public  String afterFellInUpperCase(String inputString) {
        String [] arrayString = inputString.split(" ");
        String upperString = arrayString[4].toUpperCase();
        return upperString;
    }

    public  String withoutFirstAndLastChar(String inputString) {
        try {
            String subString = inputString.trim().substring(1, x - 1);
            return subString;
        } catch (StringIndexOutOfBoundsException e) {
            return "";
        }
    }

    public  String repeatRepeatRepeat(String inputString) {
        if (inputString.length() <= 3) {
            return inputString;
        }else {
            StringBuilder stringBuilder = new StringBuilder(inputString);
            String intermediateString  = stringBuilder.delete( 3 , x ).toString();
            String finalString = intermediateString + intermediateString + intermediateString;

            return finalString;
        }
    }


    public  String backAround(String str) {
        char backAroundString = str.charAt(x - 1);
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.insert(0, backAroundString);
        stringBuilder.insert(x, backAroundString);
        return stringBuilder.toString();
    }


}




