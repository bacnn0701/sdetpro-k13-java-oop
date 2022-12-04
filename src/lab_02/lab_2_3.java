package lab_02;

import java.util.Scanner;

public class lab_2_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input weight & height
        System.out.print("Please input your weight(kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Please input your height(m): ");
        double height = scanner.nextDouble();

        // Calculate Expected Weight
        double expect_min_weight = 18.5*(height*2);
        double expect_max_weight = 25*(height*2);

        if (calculateBMI(weight, height) < 18.5) {
            double change_weight = expect_min_weight - weight;
            System.out.printf("You are Underweight. Pls increase at least %f (kg) ", change_weight);
        } else if (calculateBMI(weight, height) >= 18.5 && calculateBMI(weight, height) < 25 ){
            System.out.println("You are Normal weight");
        } else if (calculateBMI(weight, height) >= 25 && calculateBMI(weight, height) < 30 ) {
            double change_weight = weight - expect_max_weight;
            System.out.printf("You are Overweight. Pls decrease at least %f (kg)", change_weight);
        } else {
            double change_weight = weight - expect_max_weight;
            System.out.printf("You are Obesity. Pls decrease at least %f (kg)", change_weight);
        }
    }
    private static double calculateBMI(double weight, double height) {
        //Calculate BMI
        return weight / (height*2);
    }

}
