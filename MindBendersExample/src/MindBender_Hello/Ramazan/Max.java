package interviewQ_part1.Practice;

public class Max {
    public static void main(String[] args) {
        int[] arr={3,5,67,34};
        int max =arr[1];//67
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
