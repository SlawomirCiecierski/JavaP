package start;
//Znajdź różnicę między liczbami większymi i mniejszymi od K w tabeli liczb całkowitych.

public class Cw22 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 2, 3, 6, 7, 2, 9};
        int szukanaLiczba = 8;
        int sumaWiekszych = 0;
        int sumaMniejszych = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > szukanaLiczba) {
                sumaWiekszych = sumaWiekszych + numbers[i];
            }
        }
        System.out.println("Suma większych liczb niż " + szukanaLiczba + " wynosi " + sumaWiekszych);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < szukanaLiczba) {
                sumaMniejszych = sumaMniejszych + numbers[i];
            }
        }
        System.out.println("Suma mniejszych liczb niż " + szukanaLiczba + " wynosi " + sumaMniejszych);
        System.out.println("Różnica wynosi " + (sumaWiekszych - sumaMniejszych));


    }
}