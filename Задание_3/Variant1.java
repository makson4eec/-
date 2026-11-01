import java.util.Scanner;
import java.util.Locale;

public class Variant1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Введите числа через пробел (дробные через точку):");
        int positive = 0, negative = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Число " + (i + 1) + ": ");
            int n = scanner.nextInt();
            if (n > 0) positive++;
            if (n < 0) negative++;
        }
        System.out.println("Положительных: " + positive + ", отрицательных: " + negative);
    }
}
