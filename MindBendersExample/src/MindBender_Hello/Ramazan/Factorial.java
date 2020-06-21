package interviewQ_part1;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int num){
        int result = 1;
       for (int i = num; i >0 ; i--) {
            result*=i;
        }
        return result;
    }
}
