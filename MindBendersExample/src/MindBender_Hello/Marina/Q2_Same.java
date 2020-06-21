package MindBender_Hello.Marina;

import java.util.Arrays;

public class Q2_Same {
    public static boolean Same(String a, String b){
        //converted to char
        char[] ch1=a.toCharArray(); //a,b,c,
        char[]ch2=b.toCharArray(); //c,b,a
        Arrays.sort(ch1);  //abc
        Arrays.sort(ch2); //abc

        String res1="", res2="";
        for(char each: ch1){
            res1+=each;
        }
        for(char each:ch2){
            res2+=each;
        }
        return res1.equals(res2);
    }

    public static void main(String[] args) {
        System.out.println(Same("ABC", "CBA"));
        System.out.println(Same("123", "324"));
    }
}
