import java.util.Scanner;
import java.util.Locale;

public class Variant8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Введите числа через пробел (дробные через точку):");
        double a = scanner.nextDouble(), b = scanner.nextDouble(), c = scanner.nextDouble();
        double middle;
        if ((a >= b && a <= c) || (a >= c && a <= b)) middle = a;
        else if ((b >= a && b <= c) || (b >= c && b <= a)) middle = b;
        else middle = c;
        System.out.println("Среднее по величине: " + middle);
    }
}
