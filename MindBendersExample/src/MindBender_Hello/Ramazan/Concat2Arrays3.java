package interviewQ_part1;

import java.util.Arrays;

/*
Write a return method that can concate two arrays
 */
public class Concat2Arrays3 {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int[] arr2={11,23,36};
        System.out.println(Arrays.toString(combine(arr1,arr2)));
    }
    public static int[] combine(int[] arr1 , int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];

        int i = 0;
        for(int each: arr1) {
            result[i] = each;
            i++;
        }
        for(int each: arr2) {
            result[i] =each;
            i++;
        }
        return result;
    }
}
