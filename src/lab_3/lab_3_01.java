package lab_3;

public class lab_3_01 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int countOddNumbers = 0;

        int countEvenNumbers = 0;

        for (int i : arr) {
            if (i%2 == 0){
                countEvenNumbers++;
            }
            else {
                countOddNumbers++;
            }
        }

        System.out.println("Odd numbers: " +countOddNumbers);
        System.out.println("Even numbers: " +countEvenNumbers);

    }
}
