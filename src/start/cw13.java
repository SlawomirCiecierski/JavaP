package start;

import java.util.Scanner;

public class cw13 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        System.out.println("Podaj staż pracy:");
        // klucz do instrukcji switch=case
        int key = scanner.nextInt();

        switch (key){
            case 0: case 1:  case 2: case 3: case 4: case 5:
                System.out.println("Wynik - JUNIOR");
            break;
            case 6: case 7: case 8: case 9: case 10:
                System.out.println("Wynik - REGULAR");
            break;
            default:
                System.out.println("Wynik - SENIOR");
            break;
        }
    }
}
