import java.util.InputMismatchException;
import java.util.Scanner;

public class Tickets {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int bonusStep = 20;
        try {
            System.out.print("Введите стоимость билета: ");
            int cost = scanner.nextInt();
            if (cost < 0) {
                System.out.println("Ошибка: Стоимость не может быть отрицательной!");
            } else {
                System.out.println("Количество бонусов : " + (cost / bonusStep));
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введено не целое число!");
        }
    }
}
