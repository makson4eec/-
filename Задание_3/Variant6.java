import java.util.Scanner;
import java.util.Locale;

public class Variant6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Введите числа через пробел (дробные через точку):");
        int a = scanner.nextInt(), b = scanner.nextInt();
        if (a != b) { int sum = a + b; a = sum; b = sum; }
        else { a = 0; b = 0; }
        System.out.println("A = " + a + ", B = " + b);
    }
}
