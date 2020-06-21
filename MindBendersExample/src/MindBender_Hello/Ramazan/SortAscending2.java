package interviewQ_part1;

import java.util.Arrays;

/*
4,6,13,5,89
4,6,5,13,89
4,5,6,13,89
4,5,6,13,89

 */
public class SortAscending2 {
    public static void main(String[] args) {
        int[] arr1 = {13,4,600,89,5};
        sort(arr1);
    }
    public static int[] sort(int[] arr) {
        int n = arr.length; // bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }
                System.out.println(Arrays.toString(arr));
            }
        }
        return arr;
    }
}
