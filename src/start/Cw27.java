package start;

//Znajdź najmniejszą sumę kolejnych K (tu: 2) elementów w tabeli N liczb całkowitych
public class Cw27 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 1, 1, 5, 6, 9, 8, 9};
        int licznik;
        int suma = 20;
        for (licznik = 1; licznik < numbers.length; licznik++) {
            System.out.println("(" + numbers[licznik - 1] + ")+(" + numbers[licznik] + ")=(" + (numbers[licznik - 1] + numbers[licznik]) + ")");
            if (numbers[licznik - 1] + numbers[licznik] < suma) {
                suma = (numbers[licznik - 1] + numbers[licznik]);
            }

        }
        System.out.println("Najmniejsza suma: "  + suma);

    }
}

