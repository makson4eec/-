import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Расчёт стоимости покупки с учётом скидки.");
        System.out.print("Введите исходную стоимость (руб.): ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Ошибка: стоимость должна быть числом.");
            return;
        }
        double price = scanner.nextDouble();
        System.out.print("Введите процент скидки (от 0 до 100): ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Ошибка: скидка должна быть числом.");
            return;
        }
        double discount = scanner.nextDouble();
        if (!Double.isFinite(price) || !Double.isFinite(discount) || price < 0 || discount < 0 || discount > 100) {
            System.out.println("Ошибка: стоимость не может быть отрицательной, скидка должна быть от 0 до 100.");
            return;
        }
        double total = price * (1 - discount / 100);
        System.out.printf(Locale.US, "Итоговая стоимость: %.2f руб.%n", total);
    }
}
