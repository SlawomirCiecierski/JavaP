package start;

import java.util.Scanner;

public class cw19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Co chcesz obliczyć: \n(1) Pole koła  \n(2) Obwód \n(3) Powierzchnia sfery \n(0) Wyjście");
        int key = -1;
        System.out.println("wpisz promień: ");
        int promien = scanner.nextInt();

        while(key !=0)

        {

            // klucz do instrukcji switch=case
            key = scanner.nextInt();

            switch (key) {
                case 1:
                    System.out.println("Pole koła " + Math.PI * Math.pow(promien, 2));
                    break;
                case 2:
                    //case 5:
                    System.out.println("Obwód: " + 2 * Math.PI * promien);
                    break;
                case 3:
                    System.out.println("Powierzchnia sfery: " + 4 * Math.PI * Math.pow(promien, 2));
                    break;
                case 0:
                    System.out.println("Wyjście");
                    break;
                default:
                    System.out.println("Błędny wybór");
                    break;
            }
        }
    }

}



