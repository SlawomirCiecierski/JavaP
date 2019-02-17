package start;

//Ćwiczenie 4
//        Napisz program, który: ▪stworzy tablicę (macierz) 5 x 5 liczb całkowitych,
//        ▪wypełnij ją losowymi wartościami z zakresu {−5,−4,...,5},
//        ▪dla każdej kolumny wyznacz minimum,
//        ▪dla każdej kolumny wyznaczy maksimum

import java.util.Random;

public class CwP3_4_1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[][] macierz = new int[5][5];
        int wiersz, kolumna;
        int minimumKolumna = 100;
        int maksimumKolumna = -100;

        //wypełnianie macierzy
        for (wiersz = 0;
             wiersz < 5;
             wiersz++) {
            for (kolumna = 0;
                 kolumna < 5;
                 kolumna++) {
                int przypadkowa = rnd.nextInt(11) - 5;
                macierz[wiersz][kolumna] = przypadkowa;
            }
        }
        //wyświetlanie macierzy
        for (wiersz = 0;
             wiersz < 5;
             wiersz++) {
            for (kolumna = 0;
                 kolumna < 5;
                 kolumna++) {
                System.out.printf("[" + macierz[kolumna][wiersz] + "] ");

            }
            System.out.println();
        }
        //minimum i maksimum w kolumnie
        for (wiersz = 0;
             wiersz < 5;
             wiersz++) {
            minimumKolumna = 100;
            maksimumKolumna = -100;
            for (kolumna = 0;
                 kolumna < 5;
                 kolumna++) {
                if (macierz[wiersz][kolumna] <= minimumKolumna) {
                    minimumKolumna = macierz[wiersz][kolumna];
                }
                if (macierz[wiersz][kolumna] >= maksimumKolumna) {
                    maksimumKolumna = macierz[wiersz][kolumna];
                }

            }
            System.out.println("Minimum kolumny " + minimumKolumna);
            System.out.println("Maksimum kolumny " + maksimumKolumna);
            System.out.println();
        }


    }
}
