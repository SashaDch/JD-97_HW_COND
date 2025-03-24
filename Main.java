import ru.netology.bissextile.Bissextile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int year;
        int days;
        int score = 0;

        while (true) {
            System.out.println("Введите год: ");
            year = scanner.nextInt();
            System.out.println("Введите количество дней: ");
            days = scanner.nextInt();
            if (days != Bissextile.calcDays(year)) {
                break;
            }
            score++;
        }
        System.out.println("Неправильно! В этом году " + Bissextile.calcDays(year) + " дней!");
        System.out.println("Набрано очков: " + score);
    }
}