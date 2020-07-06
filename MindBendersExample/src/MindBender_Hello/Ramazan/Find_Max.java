package interviewQ_part1.Practice;

public class Find_Max {
    //Write a method that can find the maximum number from an int Array
    public static void main(String[] args) {
        int[] arr = {5,4,7,9,2};
        int max = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
