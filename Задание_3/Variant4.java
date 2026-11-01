import java.util.Scanner;
import java.util.Locale;

public class Variant4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Введите числа через пробел (дробные через точку):");
        double a = scanner.nextDouble(), b = scanner.nextDouble();
        System.out.println(Math.max(a,b) + " " + Math.min(a,b));
    }
}
