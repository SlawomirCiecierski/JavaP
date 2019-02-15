package start;

public class Cw23 {
    public static void main(String[] args) {

        int[] numbers = {1, 8, 5, 2, 3, 6, 7, 2, 3};
        int najwieksza=0;
        int najwieksza_1=0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= najwieksza) {
                //najwieksza_1=najwieksza;
                najwieksza=numbers[i];
            }
        }
        System.out.println("Dwie najwieksze liczby to " + najwieksza_1 + " oraz " + najwieksza);
        System.out.println("Iloczyn to " + najwieksza_1 * najwieksza);


//do domu 3.3, 3.4, 3.5

    }
}
