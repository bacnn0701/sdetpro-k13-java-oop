package lab_06;

public class lab_06_03 {

    public static String extractDigit(String str) {

        char[] chars = str.toCharArray();

        String strOutput = "";
        for (char aChar : chars) {
            if (Character.isDigit(aChar)) {
                strOutput = strOutput + aChar;
            }
        }

        return strOutput;
    }

    public static void main(String[] args) {

        System.out.println(extractDigit("100pppp3654"));
    }
}
