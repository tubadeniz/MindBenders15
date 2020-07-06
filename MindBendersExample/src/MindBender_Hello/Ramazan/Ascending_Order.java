package interviewQ_part1.Practice;

import java.sql.SQLOutput;
import java.util.Arrays;
//Write a return method that can sort an int array in Ascending order
// without using the sort method of the Arrays class
public class Ascending_Order {
    public static void main(String[] args) {
        int[] arr = {5,3,7,23};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("======================");
        System.out.println(Arrays.toString(order(arr)));

    }

    public static int[] order(int[] arr2){
        for (int i = 0; i <=arr2.length-2 ; i++) {
            for (int j = i+1; j <=arr2.length-1 ; j++) {
                if(arr2[i]>arr2[j]){
                    int temp = arr2[i];
                    arr2[i]=arr2[j];//3,3,7,23
                    arr2[j] = temp;
                }
            }
        }
        return arr2;
    }
}
