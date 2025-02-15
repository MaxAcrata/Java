import java.util.InputMismatchException;
import java.util.Scanner;

public class Cellular {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int bill = 100; // Начальный баланс
        boolean validInput = false; // Флаг для проверки корректности ввода

        while (!validInput) {
            try {
                System.out.print("Введите сумму пополнения: ");
                int recharge_amount = scanner.nextInt();

                if (recharge_amount < 0) {
                    System.out.println("Ошибка: сумма пополнения не может быть отрицательной!");
                } else {
                    if (recharge_amount > 1000) {
                        bill += recharge_amount + (recharge_amount / 100); // Бонус за пополнение больше 1000
                    } else {
                        bill += recharge_amount; // Обычное пополнение
                    }

                    System.out.println("Сумма на счету: " + bill);
                    validInput = true; // Ввод корректен, выходим из цикла
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введено не целое число!");
            }
        }
    }
}
