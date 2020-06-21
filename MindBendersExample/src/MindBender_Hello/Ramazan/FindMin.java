package interviewQ_part1.Practice;

import java.util.Arrays;

//Write a method that can find the min. number from an int Array
public class FindMin {
        public static void main(String[] args) {
            int[] arr = {3,5,8,3,90,43};
            int min = arr[5];
           // int min = Integer.MAX_VALUE;
            for (int i = 0; i <arr.length ; i++) {
                if(arr[i]<min){
                    min=arr[i];
                }
            }
            System.out.println(min);

            Arrays.sort(arr);
            System.out.println("min: "+arr[0]);
            System.out.println("max: "+ arr[arr.length-1]);
        }

}
