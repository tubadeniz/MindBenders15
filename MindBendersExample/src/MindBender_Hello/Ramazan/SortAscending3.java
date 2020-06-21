package interviewQ_part1;

import java.util.Arrays;

/*
4,6,13,5,89
4,6,5,13,89
4,5,6,13,89
4,5,6,13,89

 */
public class SortAscending3 {
    public static void main(String[] args) {
        int[] arr1 = {13,4,600,89,5};
        System.out.println(Arrays.toString(sort(arr1)));
    }
    public static int[] sort(int[] arr) {
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]>arr[j]){
                    int originalFirstIndex = arr[i];
                    arr[i]=arr[j];//4,4,600,89,5 gibi basladi
                    arr[j]=arr[i];// dersek olmaz, cunku 4 =4 demis oluruz, onun icin orginalFirstIndex olusturduk ki reusable yapabilelim
                    arr[j]=originalFirstIndex;
                    System.out.println(Arrays.toString(arr));// adimlari gormek icin yazdiralim.
                }
            }
        }
        return arr;
    }
}
