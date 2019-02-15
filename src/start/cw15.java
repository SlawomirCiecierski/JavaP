package start;

import java.util.Scanner;

public class cw15 {
    public static void main(String[] args){
        int liczbaArabska;

    Scanner scanner= new Scanner (System.in);
        System.out.println("Podaj cyfrę arabską 0-10:");
    // klucz do instrukcji switch=case
    int key = scanner.nextInt();

        switch (key) {
            case 0:
                System.out.println("Liczba arabska " + key + " rzymska 0");
                break;
            case 1:
                System.out.println("Liczba arabska " + key + " rzymska I");
                break;
            case 2:
                System.out.println("Liczba arabska " + key + " rzymska II");
                break;
            case 3:
                System.out.println("Liczba arabska " + key + " rzymska III");
                break;
            case 4:
                System.out.println("Liczba arabska " + key + " rzymska IV");
                break;
            case 5:
                System.out.println("Liczba arabska " + key + " rzymska V");
                break;
            case 6:
                System.out.println("Liczba arabska " + key + " rzymska VI");
                break;
            case 7:
                System.out.println("Liczba arabska " + key + " rzymska VII");
                break;
            case 8:
                System.out.println("Liczba arabska " + key + " rzymska VII");
                break;
            case 9:
                System.out.println("Liczba arabska " + key + " rzymska IX");
                break;
            case 10:
                System.out.println("Liczba arabska " + key + " rzymska X");
                break;
            default:
                System.out.println("To nie jest cyfra rzymska lub inna");
                break;
        }
    }
}
