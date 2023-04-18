package lab_3;

public class lab_3_02 {

    public static void main(String[] args) {

        int[]   arr = {1, 2, 3, 4, 5};

        int maxValue = arr[0];
        int minValue = arr[0];

        //Find maxValue
        for (int i = 1; i < arr.length; i++) {
            if ( maxValue < arr[i]){
                maxValue = arr[i];
            }
        }

        //Find minValue
        for (int i = 1; i < arr.length; i++) {
            if( minValue > arr[i]) {
                minValue = arr[i];
            }
        }

        System.out.println("Max value: " +maxValue);
        System.out.println("Min value: " +minValue);
    }
}
