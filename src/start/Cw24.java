package start;


//Zadanie 3ppkt5 najmniejszy iloraz
public class Cw24 {
    public static void main(String[] args) {
        double[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double najmniejszyIloraz = 10;
        int licznik1;
        int licznik2;
        double iloraz;

        for (licznik1 = 0; licznik1 < numbers.length; licznik1++) {
            for (licznik2 = 0; licznik2 < numbers.length; licznik2++) {
                iloraz = (numbers[licznik1]) / (numbers[licznik2]);
                //System.out.println("("+numbers[licznik1] +")/("+ numbers[licznik2]+")=("+iloraz+")");

                if (iloraz < najmniejszyIloraz) {
                    najmniejszyIloraz = iloraz;

                }
            }
        }
        System.out.println("Najmniejszy iloraz to: " + najmniejszyIloraz);
    }
}
