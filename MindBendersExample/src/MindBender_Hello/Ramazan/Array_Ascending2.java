package MindBender_Hello.Ramazan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Array_Ascending2 {


    //Write a return method that can sort an int array in Ascending order
    // without using the sort method of the Arrays class
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        Integer[] arr = {9,6,5,97,54};

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : arr) pq.add(i);

        while (!pq.isEmpty()) {
            System.out.print(pq.poll()+" ");
        }
        System.out.println();

//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> list2 = new ArrayList<>();
//        for (int i = 0; i <arr.length ; i++) {
//            list.add(arr[i]);
//        }
//
//
//        while(list.size()>0){
//            for (int i = 0; i <list.size() ; i++) {
//                if(list.get(i)<min){
//                    min = list.get(i);
//                }
//            }
//
//            list2.add(min);
//            list.remove(min);
//
//        }
//
//        System.out.println(list2);

    }
}
