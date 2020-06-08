package MindBender_Hello.Shevgin.Interview;


import java.util.Arrays;
import java.util.LinkedHashSet;

public class J3_RemoveDublicates {
    public static void main(String[] args) {
        System.out.println(removeDup("AAABBBCCC"));
    }
    public static  String  removeDup( String  str) {

        String result = "";

        for (int i = 0; i < str.length(); i++)
            if (!result.contains("" + str.charAt(i)))
                result += "" + str.charAt(i);



        return result;

    }
    public static String removeDup1(String str) {

        str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();

        str = str.replace(", " ,  "" ).replace("[","").replace("]","");

        return  str;

    }
    public static String removeDup2(String str) {

        String strcopy [] =  str.split("") ;

        Arrays.sort(strcopy);

        String a1="";

        String result="";

        for(String each: strcopy)

            a1 +=each;

        for (int i = 0; i < str.length(); i++)
            if (!a1.contains("" + str.charAt(i)))
                a1 += "" + str.charAt(i);



        return  str;

    }


}

