package MindBender_Hello.Zeynep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Swap {

    public static void main(String[] args) {
        Swap(23, 67);

       int arr[] = {1,2,3,5,4};
       swap_array_element(arr,4,5);


       //swap with collections
        ArrayList<String> list = new ArrayList<>(Arrays.asList("a","b","c","d","e","f"));

        System.out.println(list);

        Collections.swap(list,1,2);
        System.out.println(list);




    }


    public static void Swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a is: " + a + " and b is: " + b);

        // second way
        // b = a + b - ( a = b);

    }

    public static int[] swap_array_element(int[] arr , int j, int i) {

        arr[i] = (arr[i] + arr[j]) - (arr [j] = arr[i]);

        /*
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
         */

        return arr;
    }


}





