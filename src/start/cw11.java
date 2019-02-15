package start;

import java.util.Scanner;

public class cw11 {

    public static void main(String[] args) {

        String login, password;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Login:");
        login = scanner.nextLine();
        System.out.println("Hasło:");
        password = scanner.nextLine();
        //---------------------------
        // homework: napisać wykorzystując else-if
        if (login.equals("admin") && password.equals("admin")) {
            System.out.println(" Witaj adminie");
        } else {
            if (login.equals("user") && password.equals("user")) {
                System.out.println(" Witaj użytku");
            } else {
                System.out.println(" BŁĄD LOGOWANIA");
            }
        }
                                                                }
    }