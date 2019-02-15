package start;
//Znajdz największą i najnmiejszą liczbę z tablicy
public class Cw25 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int liczba = 0;
        //====================================================
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= liczba) {

                liczba=numbers[i];
            }
        }
        System.out.println("Największa liczba to: " + liczba);
        //====================================================
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] <= liczba) {

                liczba=numbers[i];
            }
        }
        System.out.println("Najmniejsza liczba to: " + liczba);
        //====================================================
    }
}
