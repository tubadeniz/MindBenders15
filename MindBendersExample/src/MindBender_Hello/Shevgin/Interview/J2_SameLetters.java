package MindBender_Hello.Shevgin.Interview;

import java.util.Arrays;
import java.util.TreeSet;

public class J2_SameLetters {
    /*
    Write a return method that check if a string is build out of the same letters as another string.

    Ex:  same("abc",  "cab"); -> true

    same("abc",  "abb"); -> false:
     */
    public static void main(String[] args) {
        System.out.println(same("şevgin good","şevgingood"));

        System.out.println(Same2("abcd","abdc"));

        //System.out.println(Same2("şevgin good","şevgingood"));



    }
    public static boolean same(String a, String b) {

        char[] ch1 = a.toCharArray();

        char[]  ch2 = b.toCharArray();

        Arrays.sort(ch1);

        Arrays.sort(ch2);

        String a1="", a2="";

        for(char each: ch1)

            a1 +=each;


        for(char each: ch2)

            a2 +=each;
        return  a1.equals(a2) ;

    }
    public static boolean Same1(String str1, String str2) {

        str1 = new TreeSet<String>(Arrays.asList( str1.split("") ) ).toString( );

        str2 = new TreeSet<String>(Arrays.asList( str2.split("") ) ).toString( );

        return  str1.equals(str2);

    }
    public static boolean Same2(String str1, String str2) {

        String strcopy1 [] =  str1.split("") ; // a b c

        String strcopy2[] = str2.split(""); // c a b

        Arrays.sort(strcopy1); // a b c
        Arrays.sort(strcopy2);


        return   Arrays.equals(strcopy1,strcopy2) ;

    }
}