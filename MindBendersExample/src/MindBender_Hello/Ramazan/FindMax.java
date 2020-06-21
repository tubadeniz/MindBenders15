package interviewQ_part1.Practice;

public class FindMax {
        public static void main(String[] args) {
            int[] arr = {4,6,1,67,34};
            int max = arr[0];
            //int max = Integer.MIN_VALUE;
            System.out.println(max);
            for (int i = 0; i <arr.length ; i++) {
                if(arr[i]>max){
                    max = arr[i];
                }

            }
            System.out.println(max);
        }
}
