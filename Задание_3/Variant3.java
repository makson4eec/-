import java.util.Scanner;
import java.util.Locale;

public class Variant3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Введите числа через пробел (дробные через точку):");
        double a = scanner.nextDouble(), b = scanner.nextDouble();
        if (a == b) System.out.println("Числа равны");
        else System.out.println(a < b ? 1 : 2);
    }
}
