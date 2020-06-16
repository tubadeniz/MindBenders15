package MindBender_Hello.Marina;

import java.util.Arrays;

public class Q8_9_Max_and_Min {

    public static void MaxNumber(int[]arr){//MaxNumber method
        Arrays.sort(arr);  //sorted arrays
        System.out.println("MaxNumber: "+arr[arr.length-1]);

    }


    public static void MinNumber(int []array){
        Arrays.sort(array);  // ascending order
        System.out.println("Minimum number: "+array[0]);
    }

    public static void main(String[] args) {

        MaxNumber(new int[]{1, 2, 5, 8, 9, 7, 12});

        MinNumber(new int[] {10, 5, 8, 0, 13, 4});
    }
}

  
