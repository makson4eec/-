import java.util.Scanner;
import java.util.Locale;

public class Variant10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Введите числа через пробел (дробные через точку):");
        double a = scanner.nextDouble(), b = scanner.nextDouble(), c = scanner.nextDouble();
        double min = Math.min(a, Math.min(b,c));
        System.out.println("Сумма двух наибольших: " + (a + b + c - min));
    }
}
