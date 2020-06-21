package interviewQ_part1;

import java.util.Arrays;

/*
Write a return method that can concate two arrays
 */
public class Concat2Arrays2 {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int[] arr2={11,23,36};
        System.out.println(Arrays.toString(combine(arr1,arr2)));
    }
    public static int[] combine(int[] arr1, int[] arr2){
        int[] result=new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        for (int i = 0; i <arr2.length ; i++) {
            result[i+arr1.length]=arr2[i];
        }

        return result;
    }

}
