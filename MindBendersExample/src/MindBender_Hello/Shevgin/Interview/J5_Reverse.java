package MindBender_Hello.Shevgin.Interview;


import java.util.Arrays;

public class J5_Reverse {
    /*
    Write a return method that can reverse  String

Ex: Reverse("ABCD"); ==> DCBA


     */
    public static void main(String[] args) {
        System.out.println(reverse("hello"));
        System.out.println(reverse2("hello hi"));
        System.out.println(reverse3("hello"));
    }

    public static String reverse(String str){
        String  strcopy []=str.split("");

        //ABCD

        String result="";

        for (int i=strcopy.length -1 ; i>=0 ; i--){
            result +=strcopy[i];
        }

        return result ;

    }
    public static String reverse2(String str) {

        String reverse="";

        for(int i=str.length()-1; i >= 0; i--)

            reverse += str.toCharArray()[i];



        return  reverse;

    }
    public  static String  reverse3(String str) {

        return new StringBuffer(str).reverse().toString();

    }


}
