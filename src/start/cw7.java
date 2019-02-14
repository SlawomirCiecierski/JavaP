package start;

public class cw7 {

    public static void main(String[] args) {

        String imie="Anna";
                imie=imie.toUpperCase();

        System.out.println(imie.charAt(imie.length()-1)=='A' &&
                    !imie.equals("KUBA") &&
                    !imie.equals("BARNABA")? "kobieta" :" mężczyzna");


    }
}
