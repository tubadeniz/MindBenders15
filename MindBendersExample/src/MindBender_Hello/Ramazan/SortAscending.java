package interviewQ_part1;

import java.util.ArrayList;
import java.util.Arrays;

/*
Write a return method that can sort an int array in Ascending order
without using the sort method of the Arrays class

Ex:

            int[] arr = {10, 9, 8, 7};

             arr = Sort(arr);         ==>{ 7, 8, 9, 10};
 */
public class SortAscending {
    public static void main(String[] args) {
        int[] arr1 = {13,4,6,89,5};
        System.out.println(Arrays.toString(sortArr(arr1)));
    }

    public static int[] sortArr(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
            for(int each:arr){
                list.add(each);

            }
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = min(list);
            list.remove(Integer.valueOf(arr[i]));
        }
        return arr;
    }

    public static int min(ArrayList<Integer> arr){
        int min = Integer.MAX_VALUE;
        for(int each:arr){
            if(each<min){
                min=each;
            }
        }
        return min;
    }
}
