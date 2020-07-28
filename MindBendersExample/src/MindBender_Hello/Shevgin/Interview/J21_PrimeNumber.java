package MindBender_Hello.Shevgin.Interview;

public class J21_PrimeNumber {
//    //Write a method that can check if a number is prime or not
//    In math, prime numbers are whole numbers greater than 1, that have only two factors – 1 and the number itself.
//    Prime numbers are divisible only by the number 1 or itself.
//
//    For example, 2, 3, 5, 7 and 11 are the first few prime numbers.

    public static void main(String[] args) {

//        System.out.println(primeNumber(15));
//        System.out.println(primeNumber(18));
//        System.out.println(primeNumber(38));
//        System.out.println(primeNumber(1));
//        System.out.println(primeNumber(13));
//        System.out.println(primeNumber(5));
//        System.out.println(primeNumber(2));
//        System.out.println(primeNumber(3));
//        System.out.println(primeNumber(-25));
//        System.out.println(primeNumber(0));
//        System.out.println(primeNumber(7));
//        System.out.println(primeNumber(17));
//        System.out.println(primeNumber(100));
//



        System.out.println(primeNumber2(49));

    }

    public static boolean prime(int num){
        int count=0;
        for (int i = 1; i <=num ; i++) {

            if(num%i==0){
                count++;
            }
        }
        if(count>2) return false;
        return true;
    }

    //code is not working !!!!!!!!!!!!!!!!!
    public static boolean primeNumber2(int number){
        if (number>1){
            if (number==2 || number==3 || number==5){
                return true;
            }else if ( number%2==0 || number%3==0 || number%5==0 )
                return false;
            else return true;

        }else return false;

    }

    //code is not working !!!!!!!!!!!!!!!!!
    public static boolean primeNumber(int num){
        boolean result = false;

        if(num <= 1) {

            return result;

        }

        for(int i = 2; i < num; i++) {

            if(num % i == 0 ) {
                return true;

            }
        }
        return result;
    }


}
