package MindBender_Hello.Shevgin.Interview;

public class J23_ArmstrongNumbers {
//    //Write a method that can check if a number is Armstrong  number
//    An Armstrong number is a number such that the sum
//    of its digits raised to the third power is equal to the number
//    itself.  For example, 371 is an Armstrong number, since
//          3**3 + 7**3 + 1**3 = 371.

    public static boolean amstrongNumber(int num){
        int a = 0,    b =0,    c= num;

        while(num>0){
            a=num%10;
            num/=10;
            b=b+(a*a*a);
        }
        if(c==b) {
            return true;
        }
        return false;
    }
    public static boolean amstrongNumber2(int num){
        int a , b , c;
        double result;

        a=num%10; //1  371%10
        b=(num-a)/10%10; //370/10 %10 =37%10 =7
        c=(num-a-(b*10))/100%10; //371-71 =300/100=3%10 =3

        result= Math.pow(a, 3) +Math.pow(b,3)+Math.pow(c,3); // base and exponent
//        System.out.println(a+"+"+b+"+"+c+"+"+result);

        if (num==result) return true;
        else return false;

    }

    public static void main(String[] args) {
        System.out.println(amstrongNumber(371));
        System.out.println(amstrongNumber2(371));
    }
}
