package start;

//Znajdź najmniejszą sumę kolejnych _K_  elementów w tabeli N liczb całkowitych
public class Cw27a {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 1, 1, 1, 8, 9};
        int licznik = 0;
        int licznik2 = 0;
        int suma = 1000;
        int suma2 = 1000;
        int elementK = 4; //<---- długość ciągu K

        for (licznik = 0; licznik <= ((numbers.length - elementK)); licznik++) {
            suma2=0;
            for (licznik2 = 0; (licznik2 < elementK); licznik2++) {


                System.out.print(" [" + (licznik + licznik2) + "]=>" + numbers[(licznik + licznik2)]);

                suma2 = suma2 + numbers[(licznik + licznik2)];
            }

            System.out.println("   suma="+suma2);
            if (suma2<suma){
                suma = suma2;
            }

        }
        System.out.println(" ");
        System.out.println("Najmniejsza suma: " + suma);

    }
}

