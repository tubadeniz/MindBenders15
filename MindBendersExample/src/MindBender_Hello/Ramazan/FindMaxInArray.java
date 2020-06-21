package interviewQ_part1;
// find max in array, but dont use sort method
public class FindMaxInArray {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,23,12};
        int max =arr[0];//int max = Integer.MIN_VALUE can be used.
            for(int each:arr){
                if(each>max){
                    max=each;
                }
            }
        System.out.println(max);
    }
}
