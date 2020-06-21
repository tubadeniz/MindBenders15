package MindBender_Hello.Shevgin.Interview;

import java.util.ArrayList;
import java.util.Arrays;

public class J10_Array_SortAscending {
    /*
    Write a return method that can sort an int array in Ascending order without using the s
    ort method of the Arrays class

Ex:
            int[] arr = {10, 9, 8, 7};

             arr = Sort(arr);         ==>{ 7, 8, 9, 10};
     */
    public static void main(String[] args) {
        int [] ss={-5,19,8,15,25,3};
        System.out.println(Arrays.toString(ascending(ss)));

        System.out.println(Arrays.toString(Sort(ss)));
        SortingArrayAsc(ss);
    }

    public static int[] ascending(int[]arr){

        for (int i=0; i<arr.length ;i++){

            for (int j=0 ;j<arr.length ;j++){

                if (arr[i]<arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;


    }


    public static int[] Sort(int[] a) {

        ArrayList<Integer> list=new ArrayList<>();
        for (int each:a ) {
            list.add(each);
        }

        for (int i=0;i<a.length;i++){
            a[i]=findMin(list);
            list.remove(Integer.valueOf(a[i]));
        }

        return a;

    }

    public static int findMin(ArrayList<Integer> a) {

       int min=Integer.MAX_VALUE;

        for (Integer each:a) {
            min=Math.min(each,min);

        }
        return min;

    }
    public static void SortingArrayAsc(int[] arr) {

        ArrayList<Integer> list = new ArrayList();

        for(int each: arr) {

            list.add(each);

        }

        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.size(); j++) {

                if (list.get(i) < list.get(j)) {

                    Integer temp = list.get(i);

                    list.set(i, list.get(j));

                    list.set(j, temp);

                }

            }

        }



        System.out.println(list);

    }
}
