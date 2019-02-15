package start;

public class Cw21 {
    public static void main(String[] args) {

     int[] numbers = {1, 2, 3, 2, 3, 6, 7, 2, 9};
     int szukanaLiczba=11;
     int licznikSzukanych=0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]==szukanaLiczba){
                licznikSzukanych++;
            }
        }
        System.out.printf("Ilość znalezionych liczb "+ szukanaLiczba+" wynosi "+licznikSzukanych);
    }
}
