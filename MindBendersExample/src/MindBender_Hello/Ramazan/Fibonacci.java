package interviewQ_part1;

import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    public static int fib(int num){
        int a =1;
        int b =1;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        int result = 0;
        for (int i = 2; i <num ; i++) {
            result = list.get(i-1)+list.get(i-2);
            list.add(result);
        }
        return list.get(num-1);
    }
}
