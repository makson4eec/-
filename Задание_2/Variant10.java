import java.util.Scanner;
import java.util.Locale;

public class Variant10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.print("Введите x: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Ошибка: нужно ввести число.");
            return;
        }
        double x = scanner.nextDouble();
        if (!Double.isFinite(x) || x < 0) {
            System.out.println("Ошибка: x вне области допустимых значений.");
            return;
        }
        double y = x * Math.sqrt(x) + Math.pow(x, 5) + Math.exp(x);
        if (!Double.isFinite(y)) {
            System.out.println("Ошибка вычисления: результат не определён.");
            return;
        }
        System.out.println("y = " + y);
    }
}
