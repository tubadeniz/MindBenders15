package MindBender_Hello.Lale;

import java.util.Arrays;

public class S_02_SameLetters {

     /*
    Write a return method that check if a string is build out of the same letters as another string.

Ex:  same("abc",  "cab"); -> true

same("abc",  "abb"); -> false:
     */



    public static void main(String[] args) {
        System.out.println(isSame2("job", "obj"));
    }

    public static boolean sameLetter(String str1, String str2) {

        if(str1.length() != str2.length()){
            return false;
        }

        char [] ch1 = str1.toLowerCase().replace(" ","").toCharArray();
        char [] ch2 = str2.toLowerCase().replace(" ","").toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        Arrays.toString(ch1);
        Arrays.toString(ch2);

        return Arrays.equals(ch1,ch2);

    }

    public static boolean isSame2(String s1, String s2){

        boolean same = true;

        for(int i=0; i<s1.length(); i++){
            if(!s2.contains(""+s1.charAt(i)))
                same = false;
        }
        return same;


        //njnm m
    }
}


