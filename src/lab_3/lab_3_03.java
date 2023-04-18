package lab_3;

import java.util.*;

public class lab_3_03 {
    public static void main(String[] args) {

        int[] arr2 = {12, 34, 1, 16, 28};

        //Bubble sort - set max/min value for first element

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length-i-1; j++) {
                if (arr2[j] > arr2[j+1]) {
                    int temp = arr2[j];
                    arr2[j] = arr2[j+1];
                    arr2[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr2));

//        for (int i = 0; i < arr1.length-1; i++) {
//            int minIndex = i;
//            for (int j = i+1; j < arr1.length; j++) {
//                if (arr1[j] < arr1[minIndex]) {
//                    minIndex = j;
//                }
//            }
//            int temp = arr1[i];
//            arr1[i] = arr1[minIndex];
//            arr1[minIndex] = temp;
//        }
//        System.out.println(Arrays.toString(arr1));

        Integer[] arr1 = {12, 34, 1, 16, 28, 1};
        List<Integer> myArrayList1 = new ArrayList<>(List.of(arr1));
        Set<Integer> set1 = new HashSet<>(myArrayList1);
        myArrayList1 = new ArrayList<>(set1);
        System.out.println(myArrayList1);

        Integer[] arr = {5, 3, 1, 2, 5, 4};
        List<Integer> myArrayList = Arrays.asList(arr);
        Set<Integer> set = new HashSet<>(myArrayList);
        myArrayList = new ArrayList<>(set);
        System.out.println(myArrayList);



    }
}
