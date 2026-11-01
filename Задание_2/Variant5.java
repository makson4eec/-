import java.util.Scanner;
import java.util.Locale;

public class Variant5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.print("Введите x: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Ошибка: нужно ввести число.");
            return;
        }
        double x = scanner.nextDouble();
        if (!Double.isFinite(x) || Math.abs(Math.sin(x)) < 1e-12) {
            System.out.println("Ошибка: x вне области допустимых значений.");
            return;
        }
        double y = Math.pow(Math.cos(x), 3) - Math.sin(2 * x) + 1 / Math.tan(x);
        if (!Double.isFinite(y)) {
            System.out.println("Ошибка вычисления: результат не определён.");
            return;
        }
        System.out.println("y = " + y);
    }
}
