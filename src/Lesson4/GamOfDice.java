package Lesson4;

import java.util.Random;

/*. Бросьте кубик за пользователя (сгенерируйте случайное число от 1 до 6) и
продвиньте пользователя на это количество делений на игровом поле.
код который возвращает рандомное число от 1 до 6
Random random = new Random();
int die = random.nextInt(6) + 1;
2. После каждого броска вывести инфо в консоль пользователю, на каком игровом
поле он находится и сколько еще мест ему нужно пройти, чтобы выиграть.
3. Всего 5 бросков
4. Если пользователь набирает 20 до 5 бросков, завершите игру - он выиграл.
5. Если пользователь набирает больше или меньше 20 точно, то он проигрывает.
6. Помните, что на доске всего 20 делений, поэтому сообщение типа «Вы
продвинулись на позицию 22» - это баг)*/
public class GamOfDice {
    public static void main(String[] args) {
        Random random = new Random();
        int finish = 20;
        int current = 0;
        int movesLeft = 20;

        for (int i = 0; i < 5; i++) {
            int die = random.nextInt(6) + 1;
            current += die;
            movesLeft -= die;
            if (current == 20) {
                System.out.println("you are a winner");
                break;
            } else if (current > 20) {
                break;
            }
            System.out.println("you are on the " + current + " field, " + movesLeft + " fields to win");

        }
        if (current != 20) {
            System.out.println("You lose, try again ");

        }
    }
}
