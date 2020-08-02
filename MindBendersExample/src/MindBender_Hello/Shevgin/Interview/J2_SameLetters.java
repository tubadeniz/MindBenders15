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
//        System.out.println(same("şevgin good","şevgingood"));

//        System.out.println(Same2("abcd","abdc"));


        System.out.println(Same1("motor","rotom"));

        System.out.println(same("motor","rotom"));

        //System.out.println(Same2("şevgin good","şevgingood"));



    }
    public static boolean same(String a, String b) {

        char[] ch1 = a.toCharArray();

        char[] ch2 = b.toCharArray();

        Arrays.sort(ch1);

        Arrays.sort(ch2);

        System.out.println(ch1);
        System.out.println(ch2);

        return ch1==ch2;

//        String a1="", a2="";
//
//        for(char each: ch1)
//
//            a1 +=each;
//
//
//        for(char each: ch2)
//
//            a2 +=each;
//        return  a1.equals(a2) ;

    }

    public static boolean Same1(String str1, String str2) {

        str1 = new TreeSet<String>(Arrays.asList( str1.split("") ) ).toString( );

        str2 = new TreeSet<String>(Arrays.asList( str2.split("") ) ).toString( );

        System.out.println(str1);
        System.out.println(str2);

        return  str1.equals(str2);

    }
    public static boolean Same2(String str1, String str2) {

        String strcopy1 [] =  str1.split("") ; // m o t o r

        String strcopy2[] = str2.split(""); // r o t o m

        Arrays.sort(strcopy1); // m o o r t
        Arrays.sort(strcopy2); // m o o r t


        return   Arrays.equals(strcopy1,strcopy2) ;

    }
}