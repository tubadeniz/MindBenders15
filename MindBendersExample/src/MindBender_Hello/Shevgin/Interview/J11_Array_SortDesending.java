package MindBender_Hello.Shevgin.Interview;

import sun.awt.SunHints;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class J11_Array_SortDesending {
    /*
    Write a return method that can sort an int array in descending order
     without using the sort method of the Arrays class

Ex:  int[] arr = {10,20,7, 8, 90};

                 arr = Sort(arr);  ==>  {90, 20, 10, 8, 7};


     */

    public static void main(String[] args) {
        int[] arr = {10,20,7, 8, 90};
        System.out.println(Arrays.toString(desending(arr)));
    }
    public static int[] desending(int []arr){
        ArrayList<Integer> list=new ArrayList<>();
        for (int each:arr ) {
            list.add(each);
        }

        for (int i=0;i<arr.length;i++){
            arr[i]=findMax(list);
            list.remove(Integer.valueOf(arr[i]));
        }

        return arr;
    }
    public static int findMax(ArrayList<Integer> a){
        int max=Integer.MIN_VALUE;
        for (int each:a ) {
            max=Math.max(each,max);

        }
        return max;

    }
    public static void SortingArrayDesc(int[] arr) {

        ArrayList<Integer> list = new ArrayList();

        for(int each: arr) {

            list.add(each);

        }

        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.size(); j++) {

                if (list.get(i) > list.get(j)) {

                    Integer temp = list.get(i);

                    list.set(i, list.get(j));

                    list.set(j, temp);

                }

            }

        }

        for(int i=0; i < list.size(); i++) {

            arr[i] = list.get(i);

        }

    }
}
