package start;

public class cw20 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i = i + 2) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for (int i = 0; i <= 2; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        int szukane = 4;
        boolean znaleziono = false;
        for (int i = 0; i < numbers.length; i++) {
            if (szukane == numbers[i]) {
                System.out.println("Szukana liczba jest w indeksie: " + i);
                znaleziono = !znaleziono;
                            }
        }
        if (znaleziono == false) {
            System.out.println("nie znaleziono wartości");
        }
    }
}
