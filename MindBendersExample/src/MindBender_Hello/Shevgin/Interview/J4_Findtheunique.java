package MindBender_Hello.Shevgin.Interview;


import java.util.Arrays;
import java.util.Collections;

public class J4_Findtheunique {
    /*
    Write a return  method that can find the unique characters from the String
     Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";

     */
    public static void main(String[] args) {

        System.out.println(findunique("AAABBBCCCDEF")); // def
        System.out.println(Unique("AAABBBCCCDEF"));
        System.out.println(findunique2("AAABBBCCCDEF"));
        System.out.println(Unique2("AAABBBCCCDEF"));

    }
    //

    public static String findunique(String str){
        String unique="";

        String [] strcopy= str.split("");


        String result="";

        for (int i=0; i<strcopy.length ; i++){

            int count=0;
            for (int k=0;k<strcopy.length ;k++ ){
                if (strcopy[k].equals(strcopy[i])) {
                    count++;

                }
            }
            if (count==1) result+=strcopy[i];
        }

        return result;
    }

    public static String findunique2(String str){
        String unique="";

        String [] strcopy= str.split("");


        String result="";

        for (String each1:strcopy){

            int count=0;
            for (String each2:strcopy){
                if (each2.equals(each1)) {
                    count++;

                }
            }
            if (count==1) result+=each1;
        }

        return result;
    }
    public static String Unique(String str) {

        String result ="";

        for(String each : str.split(""))

            result +=(  (Collections.frequency(Arrays.asList(str.split("")), each)) ==1 ) ? each : "";



        return result;

    }
    public static String Unique2(String str) {
        String unique="";

        // String [] strcopy= str.split("");

        String result ="";

        for (int k=0;k<str.length() ;k++ ){

            if (str.indexOf(str.charAt(k))==str.lastIndexOf(str.charAt(k))) {
                result +=str.charAt(k);

            }
        }


        return result;

    }
}
