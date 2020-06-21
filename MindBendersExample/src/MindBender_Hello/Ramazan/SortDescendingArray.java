package interviewQ_part1;

import java.util.Arrays;

/*
Write a return method that can sort an int array in descending order without
 using the sort method of the Arrays class

Ex:  int[] arr = {10,20,7, 8, 90};

                 arr = Sort(arr);  ==>  {90, 20, 10, 8, 7};
 */
public class SortDescendingArray {
    public static void main(String[] args) {
        int[] arr1 = {13,4,600,89,5};
        System.out.println(Arrays.toString(descending(arr1)));
    }

    public static int[] descending(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i]<arr[j]){
                    int swap= arr[i];
                    arr[i]=arr[j];
                    arr[j]=swap;
                }
            }
        }
        return arr;
    }
}
