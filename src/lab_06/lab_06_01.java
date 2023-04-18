package lab_06;

import java.util.Arrays;

public class lab_06_01 {

    public static void main(String[] args) {
        String str = "2 hrs and 5 minutes";
        String[] str1 = str.split("and");

        int hrs = Integer.parseInt(str1[0].trim().replace(" hrs",""));
        int minutes = Integer.parseInt((str1[1]).trim().replace(" minutes",""));

        int totalMinutes = hrs*60 + minutes;

        System.out.println(totalMinutes);

    }

}
