package lab_02;

import java.util.Scanner;

public class lab_2_2 {

    public static void main(String[] args) {

        //Input number

        Scanner scanner = new Scanner(System.in);
        System.out.print("Pls input number to check: ");
        int num = scanner.nextInt();

        if ( num % 2 == 0) {
            System.out.printf("%d is even number", num);
        } else {
            System.out.printf("%d is odd number", num);
        }
    }

}
