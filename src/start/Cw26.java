package start;
//Znajdź wszystkie pary liczb, których suma jest równa danej liczbie K (bez sortowania).
public class Cw26 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int liczbaK=7;
        int licznik1;
        int licznik2;

        for (licznik1 = 0; licznik1 < numbers.length; licznik1++) {
            for (licznik2 = 0; licznik2 < numbers.length; licznik2++) {

                if (numbers[licznik1] + numbers[licznik2]== liczbaK) {

                    System.out.println("("+numbers[licznik1] +")+("+ numbers[licznik2]+")=("+liczbaK+")");
                }
            }
        }
    }
}
