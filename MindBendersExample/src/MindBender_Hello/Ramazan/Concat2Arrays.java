package interviewQ_part1;

import java.util.ArrayList;

/*
Write a return method that can concate two arrays
 */
public class Concat2Arrays {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int[] arr2={11,23,36};
        System.out.println(combine(arr1,arr2));
    }
    public static ArrayList<Integer> combine(int[] arr1, int[] arr2){
        ArrayList<Integer> list = new ArrayList<>();
        for(int each:arr1){
            list.add(each);
        }
        for(int each:arr2){
            list.add(each);
        }

        return list;
    }

}
