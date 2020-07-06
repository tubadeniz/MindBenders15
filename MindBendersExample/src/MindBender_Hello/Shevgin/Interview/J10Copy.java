package MindBender_Hello.Shevgin.Interview;

import sun.plugin.javascript.navig.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class J10Copy {
    /*
     /*
    Write a return method that can sort an int array in Ascending order without using the s
    ort method of the Arrays class

Ex:
            int[] arr = {10, 9, 8, 7};

             arr = Sort(arr);         ==>{ 7, 8, 9, 10};
     */
    public static void main(String[] args) {
        int[] arr = {5,10, 9,-2, 8, 7};
        System.out.println(Arrays.toString(ascending(arr)));
    }
    public static int [] ascending(int[] arr){
        ArrayList<Integer>list=new ArrayList<>();
        for (int each:arr ) {
            list.add(each);
        }
        for (int i=0;i<arr.length;i++){
            arr[i]=minNum(list);
            list.remove(Integer.valueOf(arr[i]));
        }

        return arr;

    }
    public static int minNum(ArrayList<Integer> a){
       int min= Integer.MAX_VALUE;
        for (int each: a) {
            min=Math.min(each,min);
        }
        return min;
    }
}
