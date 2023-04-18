package lab_06;

import java.util.Scanner;

public class lab_06_02 {

    public static void main(String[] args) {

        String password = "password123";

        int count = 0;

        do {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Vui long input password: ");

            String inputPassword = scanner.nextLine();

            if (inputPassword.equals(password)) {
                System.out.println("Right Password");
                break;
            }

            count++;

        } while (count < 3);

        if (count == 3) {
            System.out.println("Password is block!!!!");
        }



    }
}
