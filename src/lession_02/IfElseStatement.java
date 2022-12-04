package lession_02;

import java.util.Scanner;

public class IfElseStatement {

    public static void main(String[] args) {

        final int EXPECTED_TIME = 7;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter arrival time: ");
        int arrival_time = scanner.nextInt();

        // Comparison operators: ==, !=, <, >, >=, <=
        // boolean isHeOnTime = arrival_time == EXPECTED_TIME;

        // Ternary operator | Toan tu 3 ngoi
        boolean isHeOnTime = arrival_time == EXPECTED_TIME ? true : false;

        System.out.println("1. Dat xe ra");
        System.out.println("2. Chay den quan");

        if (isHeOnTime) {
            System.out.println("\t-----> Let's Talk!");
        } else {
            System.out.println("\t-----> Write Letter!");
        }

        System.out.println("3. Dat xe ra");
        System.out.println("4. Chay ve nha");
    }
}
