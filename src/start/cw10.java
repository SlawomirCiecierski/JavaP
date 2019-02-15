package start;

import java.util.Locale;
import java.util.Scanner;

public class cw10 {

    public static void main(String[] args) {
        byte age;
        //%d - dziesiątkowo
        //%.2f - zmiennoprzecinkowe 2 miejsca po przecinku
        //%c - znakowe
        //%s - boolean
       System.out.println("Rok urodzenia");
          Scanner scanner= new Scanner (System.in);
        int age_scanner = scanner.nextInt();
        if (age_scanner < 0 || age_scanner >=2019) {
            System.out.println(" Błędne dane");
        }else {

            if (2019 - age_scanner >= 18) {
                System.out.println("pełnoletni");
            } else {
                System.out.println("małoletni");
            }
                }
//        String decision =  age >=18? "pełnoletni": "małoletni";
//        System.out.println(decision);
//        System.out.println("Podaj staż pracy");
//        scanner.useLocale(Locale.US);
//        double staz = scanner.nextDouble();
//        scanner.nextLine(); // !!!!!UWAGA proteza ponieważ niestringowe nie przyjmują /n
//        System.out.println("Twój staż: " + staz);
//        System.out.println("podaj imię");
//        String name=scanner.nextLine();
//
//        System.out.println("twój staż " + staz);
//        System.out.println("twoje imię " + name);
        scanner.close();
    }
}
