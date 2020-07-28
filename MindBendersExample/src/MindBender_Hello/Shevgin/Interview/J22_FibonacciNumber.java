package MindBender_Hello.Shevgin.Interview;

import javax.sound.midi.Sequence;

public class J22_FibonacciNumber {
    //Write a return method that returns the  Fibonacci of any given number
//    The Fibonacci Sequence is the series of numbers:
//
//            0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
//
//    The next number is found by adding up the two numbers before it:
//
//    the 2 is found by adding the two numbers before it (1+1),
//    the 3 is found by adding the two numbers before it (1+2),
//    the 5 is (2+3),
//    and so on!
//    Example: the next number in the sequence above is 21+34 = 55
    public static void main(String[] args) {
//        System.out.println(fibonacciNumber(3));
//        System.out.println(fib(3));
        System.out.println(fib2(4));
        System.out.println(fibonacciNumber(3));

    }
    public static int fibonacciNumber(int num){
//        int firstNum=0;
//        int secondNum=1;
//        int result=0;
//
//            for (int i=1 ;i<num ;i++){
//                result=firstNum+secondNum; //1 //2
//                firstNum=secondNum; //1
//                secondNum=result; //1
//            }
//            return result;


            int num1=0;
            int num2=1;
            int sum=0;

            for(int i=1 ;i<num ;i++){
               if(num>=2){
                  sum=num1+num2; //
                  num1=num2;
                  num2=sum;
               }else if(num<2&&num>=0){
                   return num;
               }

            }
            return sum;


    }
    public static int fib(int num){



        int result=0;
        int j=0;
        int z=1;

        for(int i=1; i<num; i++){

            result=j+z;//1 2 3
            j=z; //J=1 1
            z=result; // 1 2

        }

        return result;

    }
    public static int fib2(int num){

        int []fib=new int[num+1]; //4  0 1 2 3
        int k=1;

        for (int i=1; i<fib.length;i++){ //3 i<4
            fib[i]=k;  //fib1 =1 fib2 1 fib 3 2
            k +=fib[i-1]; // k=1 k+=fib1 ---- k=1+1=2 k+=fib2 --k=3
        }
        return fib[num]; //fib 3



    }
}
