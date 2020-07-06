package MindBender_Hello.Lale;

public class S_12_OddEvenArray {
      /*
    Write a return method that can concate two arrays
     */


    public static int [] concatetwoarr(int [] arr, int [] arr2) {

        int[] sum = new int[arr.length + arr2.length];

        // int [] a = new int[6];
        int index = 0;
        //int total = 0;
    /*
    arr = 1,2,3,4,5
    arr3 = 1,3,5,2,4
    arr2 = 6,7,8
    sum = 1,2,3,4,5,6,7,8
    index=0,1,2,3,4,5,6,7,8;
    i = 0,1,2,3
     */
        for (int i = 0; i < arr.length; i++) {
            sum[index] = arr[i];
            index++;
        }

        for (int i = 0; i < arr2.length; i++) {
            sum[index] = arr2[i];
            index++;
        }

   /*for(int i=0;i<sum.length;i++){
        total += sum[i];
    }*/

        return sum;

    }
    }
