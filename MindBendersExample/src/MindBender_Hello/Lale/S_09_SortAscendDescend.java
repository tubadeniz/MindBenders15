package MindBender_Hello.Lale;

import java.util.Arrays;

public class S_09_SortAscendDescend {
     /*
    Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class

Ex:
            int[] arr = {10, 9, 8, 7};

             arr = Sort(arr);         ==>{ 7, 8, 9, 10};
     */


    public static void main(String[] args) {
        int[] a = {5,3,7,4,6,8,2};
        System.out.println(Arrays.toString(Ascending(a)));
    }

    public static int [] Ascending(int [] arr ) {

        // 1 3 6 4 1 7 8 2
        // i = 0,
        // i = 1

        for(int i=0;i<arr.length;i++){
            int min = arr[i];
            int index=0;
            for(int j=i;j<arr.length;j++){
                if(min>=arr[j]){
                    min = arr[j];
                    index = j;
                }
            }
            int temp = arr[i]; //temp=5
            arr[i] = min;
            arr[index] = temp;
        }
        return arr;


    }

}
