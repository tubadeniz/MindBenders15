package MindBender_Hello.Shevgin.Interview;

import java.util.Arrays;

public class J13_ConcatArrays {

    //Write a return method that can concate two arrays

    public static void main(String[] args) {
        int [] arr3={5,5,5,7,0};
        int [] arr4={4,5,5,5,7,0};
        System.out.println(Arrays.toString(concat(arr3,arr4)));
    }
    public static int[] concat(int[]arr1, int[]arr2){
        int []result=new int[arr1.length+arr2.length];

        int i=0;
        for (int each:arr1){
            result[i]=each;
            i++;
        }

        for (int each:arr2){
            result[i]=each;
            i++;
        }

        return result;

    }
}
