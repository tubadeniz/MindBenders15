package MindBender_Hello.Shevgin.Interview;

public class J6_sum_of_digits_in_a_string {

    public static void main(String[] args) {

    }

    public  static int  sumOfDigits(String s) {

        int total = 0;

        char[] ch =  s.toCharArray();

        for(char each: ch) {

            if(Character.isDigit(each)) {

                total += Integer.valueOf(""+each);

            }

        }

        return total;

    }
}