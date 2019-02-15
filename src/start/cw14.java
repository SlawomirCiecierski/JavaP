package start;

import java.util.Scanner;

import static java.lang.Math.pow;

public class cw14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Liczba1 :");
        // klucz do instrukcji switch=case
        double liczba1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Operator :");
        char operator = scanner.nextLine().charAt(0);
        System.out.println("Liczba2 :");
        double liczba2 = scanner.nextDouble();

        switch (operator) {
            case '+':
                System.out.printf("%f %c %f", liczba1, operator, liczba2, liczba1 + liczba2);
                break;
            case '-':
                System.out.printf("%f %c %f", liczba1, operator, liczba2, liczba1 - liczba2);
                break;
            case '/':
                System.out.printf("%f %c %f", liczba1, operator, liczba2, liczba1 / liczba2);
                break;
            case '*':
                System.out.printf("%f %c %f", liczba1, operator, liczba2, liczba1 * liczba2);
                break;
            case '^':
                System.out.printf("%f %c %f", liczba1, operator, liczba2, pow(liczba1, liczba2));
                break;
            case '%':
                System.out.printf("%f %c %f", liczba1, operator, liczba2, liczba1 % liczba2);
                break;

        }
    }
}
