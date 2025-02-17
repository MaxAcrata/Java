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
                int rechargeAmount = scanner.nextInt();

                if (rechargeAmount < 0) {
                    System.out.println("Ошибка: сумма пополнения не может быть отрицательной!");
                } else {
                    if (rechargeAmount > 1000) {
                        bill += rechargeAmount + (rechargeAmount / 100); // Бонус за пополнение больше 1000
                    } else {
                        bill += rechargeAmount; // Обычное пополнение
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
