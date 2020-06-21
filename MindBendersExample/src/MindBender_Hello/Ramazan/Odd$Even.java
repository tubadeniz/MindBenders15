package interviewQ_part1;

public class Odd$Even {
    public static void main(String[] args) {
        System.out.println(OddEven(5));
    }

    public static String OddEven(int num){
        if(num%2==0)return "even";
        return "odd";
    }
}
