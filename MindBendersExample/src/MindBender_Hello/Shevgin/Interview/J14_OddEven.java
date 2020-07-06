package MindBender_Hello.Shevgin.Interview;

public class J14_OddEven {
//    Write  a method which can identifies given number is even or odd
//
//    EX:
//
//    identify(5) ->  "Odd"
//
//    identify(6) ->  "Even"

    public static void main(String[] args) {
        System.out.println(numbers(5));
    }


    public static String numbers(int a){
        if (a%2==0) return "Even";
        else return "Odd";
    }
}
