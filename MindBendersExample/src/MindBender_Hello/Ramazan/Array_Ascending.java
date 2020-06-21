package MindBender_Hello.Ramazan;

import java.util.Arrays;

public class Array_Ascending {
    //Write a return method that can sort an int array in Ascending order
    // without using the sort method of the Arrays class
    public static void main(String[] args) {
        int[] arr = {9,6,5,97,54};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]>arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
