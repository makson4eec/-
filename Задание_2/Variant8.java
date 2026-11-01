import java.util.Scanner;
import java.util.Locale;

public class Variant8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.print("Введите x: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Ошибка: нужно ввести число.");
            return;
        }
        double x = scanner.nextDouble();
        if (!Double.isFinite(x) || x < -0.5 || x > 0.5) {
            System.out.println("Ошибка: x вне области допустимых значений.");
            return;
        }
        double y = Math.acos(x) + Math.asin(2 * x) + Math.atan(3 * x);
        if (!Double.isFinite(y)) {
            System.out.println("Ошибка вычисления: результат не определён.");
            return;
        }
        System.out.println("y = " + y);
    }
}
