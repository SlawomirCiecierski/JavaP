package start;

//Ćwiczenie 5
// Napisz program, który wyświetli wykres dowolnej funkcji z gwiazdek
// np. przebieg funkcji A*sinus. Liczba gwiazdek w kolejnych wierszach to wartość funkcji,
// a kolejne wiersze to argumenty funkcji np. zmiana o jakąś część kąta.
// Liczba wprowadzona z klawiaturyto amplituda A.
import static java.lang.Math.*;

public class CwP3_5 {
    public static void main(String[] args) {

int wspolrzednaXint;
int iloscGwiazdek;
double wspolrzednaY;
//for int wspolrzedna

        for (wspolrzednaXint=0; wspolrzednaXint<314; wspolrzednaXint++){

            //System.out.println(sin((double)wspolrzednaXint/100.0)*100.0);

            wspolrzednaY=sin((double)wspolrzednaXint/100.0)*100.0;
            //System.out.println(wspolrzednaY);
            iloscGwiazdek=(int)wspolrzednaY;
            for (int licznik=0; licznik<=iloscGwiazdek;licznik++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
