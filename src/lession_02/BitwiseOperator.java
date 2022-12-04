package lession_02;

public class BitwiseOperator {

    public static void main(String[] args) {

        if (getFirstNum() != 0 & getSecondNum()!=0) {
            System.out.println("Calling...");
        }

    }

    private static int getFirstNum() {
        System.out.println("Calling the first num...");
        return 0;
    }

    private static int getSecondNum() {
        System.out.println("Calling the second num...");
        return 2;
    }


}
