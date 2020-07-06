package MindBender_Hello.Zeynep;

public class Divide {

    public static void main(String[] args) {
        Divide(13,4);

    }



    public static void Divide(int dividend, int divisor){
         int quotient = 0;

         // the logic is a repeated subtraction of dividend and divisor till the dividend becomes less the divisor
         // will loop till the divisor does not become small than dividend
         while (dividend >= divisor){
             dividend = dividend  - divisor;
             quotient++;
         }
        System.out.println("Quotient is "+quotient);
        System.out.println("Remainder is "+dividend);

    }

}
