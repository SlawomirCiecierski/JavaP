package start;

import java.util.Scanner;

public class cw9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wartość a: ");
        int a=scanner.nextInt();

        System.out.println("Podaj wartość b: ");
        int b=scanner.nextInt();

        scanner.close();
        System.out.println("Podane a: " + a);
        System.out.println("Podane b: " + b);
    }

}
