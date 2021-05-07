package Lesson4;

public class SortingAnArray {
    public static void main(String[] args) {
        double[] values = {6, 5, 7, 8, 1, 2};

        for (int i = values.length - 1; i > 0; i--) {
            // Количество циклов для полного обмена местами из конца в нначало
            for (int x = 0; x < i; x++) {
            /*Сравниваем элементы попарно,
              если они имеют неправильный порядок,
              то меняем местами*/
                if (values[x] > values[x + 1]) {
                    double value = values[x];
                    values[x] = values[x + 1];
                    values[x + 1] = value;
                }
            }
        }
    }
}