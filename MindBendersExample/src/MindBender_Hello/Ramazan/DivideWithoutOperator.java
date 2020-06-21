package interviewQ_part1;

public class DivideWithoutOperator {
    public static void main(String[] args) {
        System.out.println(divide(22, 5));
    }

    public static int divide(int num1, int num2){
        int count=0;

        while(num1>=num2){
            num1-=num2;
            count++;
        }
        return count;
    }
}
