package MindBender_Hello.Shevgin.Interview;

import java.util.ArrayList;
import java.util.Arrays;

public class J12_ArrayMoveZeros {
/*
Array -- Move Zeros to the End
Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)

Ex:

input:  {1,0,2,0,3,0,4,0};

output: [1, 2, 3, 4, 0, 0, 0, 0]
 */
    public static void main(String[] args) {
        int [] arr={1,0,2,0,3,0,4,0};
        System.out.println(Arrays.toString(moveZero(arr)) );
    }
    public static int [] moveZero(int []arr){
        ArrayList<Integer> list=new ArrayList<>();
        for (int each:arr ) {
            list.add(each);
        }
        int count=0;
        for (int i=0; i<list.size() ;i++){
            if (list.get(i)==0){
                list.remove(list.get(i));
                count++;
            }
        }
        for (int i=0;i<count;i++){
            list.add(0);
        }
        for (int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }
        return arr;

    }
}
