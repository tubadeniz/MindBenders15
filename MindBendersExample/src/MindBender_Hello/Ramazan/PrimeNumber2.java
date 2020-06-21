package interviewQ_part1;

public class PrimeNumber2 {
    public static void main(String[] args) {
        System.out.println(primeNumber(9));
    }
    public static boolean primeNumber(int num) {

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
