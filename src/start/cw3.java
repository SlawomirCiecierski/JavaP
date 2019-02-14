package start;

public class cw3 {

    public static void main(String[] args) {

        String zmienna1, zmienna2, zmienna3, zmienna4;

        zmienna1 = "jego status zmieniany jest na  x .";
        zmienna2 = "Generowany jest wyjątek InterruptedException";
        zmienna3 = zmienna1 + zmienna2;
        zmienna4 = zmienna3 + "oraz Walentynki";
        System.out.println(zmienna3.toUpperCase());
        System.out.println(zmienna4.toLowerCase());
        System.out.println("Zmienna4 ma długość: "+ zmienna4.length());
        System.out.println(zmienna3.charAt(1));
        System.out.println(zmienna3.charAt(4));

        System.out.println(zmienna4.charAt((zmienna4.length() - 3)));
        String zmienna44[] = zmienna4.split(" ");
        System.out.println(zmienna44[0]);
        System.out.println(zmienna44[1]);


    }
}