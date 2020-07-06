package MindBender_Hello.Lale;

import java.util.ArrayList;
import java.util.Arrays;

public class S_10_MoveZerosToEnd {
     /*
    Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
    Ex:
    input:  {1,0,2,0,3,0,4,0};
    output: [1, 2, 3, 4, 0, 0, 0, 0]
     */


    public static void main(String[] args) {



        int[] arr = {0, 1, 3, 4, 1, 1, 1, 3};

        ArrayList<Integer> list = new ArrayList<>();

        int countZeros = 0;

        for (int each : list) {
            list.add(each);
        }
        for (int each : arr) {
            if (each == 0) {
                countZeros++;
            }
        }
        list.removeAll(Arrays.asList(0));

        //list.addAll(Arrays.asList(0));
        for (int i = 0; i < countZeros; i++) {
            list.addAll(Arrays.asList(0));
        }
        System.out.println(list);
/*

        int[] arr = {0, 1, 0, 9, 9, 0, 0, 5};

        ArrayList<Integer> list = new ArrayList<>();

        for (int each : arr) {
            list.add(each);    //we add all the arr{.......} to ArrayList because i need to use remove. method
        }

        int countZeros = 0;       //here we need to know how many zeros we have on tne arrayList
        for (int each : list) {
            if (each == 0) {
                countZeros++;
            }
        }
        list.removeAll(Arrays.asList(0));    //here we remove all the array zeros from the arraylist

        //  System.out.println(countZeros); // frequency of zeros

        for (int i = 0; i < countZeros; i++) {
            list.addAll(Arrays.asList(0));

        }
        System.out.println(list);




 */
    }
}
