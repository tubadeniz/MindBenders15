package MindBender_Hello.Shevgin.Interview;


import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class J1_FrequencyOfChars {
    //Write a return method that can find the frequency of characters
    //
    //Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

    //ABCD
    //3212

    public static void main(String[] args) {
        String str="AAABBCDDcc";
        System.out.println(FrequencyOfChars(str));
        System.out.println(FrequencyOfChars2(str));
        System.out.println(frequencymix(str));


    }
    public static String FrequencyOfChars(String str) { //AAABBCDDcc
        String nonDub="";


        for (int i=0; i<str.length() ; i++){
            if (!nonDub.contains(""+str.charAt(i))) nonDub += str.charAt(i) ; //ABCDc
        }

        String result= "";
        //3
        for (int i=0 ; i<nonDub.length() ; i++) { // 0 1
            int count=0;

            for (int k=0; k<str.length() ; k++) {



                if ( nonDub.charAt(i)==str.charAt(k)) { //A
                    count++; //1
                }


            }
            result +=""+nonDub.charAt(i)+count; //A3B2


        }


        return result;

    }
    public  static  String  FrequencyOfChars2(String str) {

        String b=new LinkedHashSet<>(Arrays.asList(str.split(""))).toString(); //[A,B,C,D,c]
        System.out.println(b);

        b = b.replace(", ","").replace("[","").replace("]","");

        String result="";

        for(int j=0; j<b.length();j++) {

            int count=0;

            for(int i=0; i<str.length(); i++)

                if(str.substring(i, i+1).equals(""+str.charAt(j)))

                    count++;



            result+=b.substring(j, j+1)+count;

        }

        return result;

    }

    public static String frequency(String str) {

        String nonDup="", result="";

        for(int i=0; i < str.length(); i++)

            if(! nonDup.contains(""+str.charAt(i)))

                nonDup += ""+str.charAt(i);



        for(int i=0; i < nonDup.length(); i++) {

            int num = Collections.frequency( Arrays.asList(str.split("") ) ,    ""+nonDup.charAt( i ) );

            result += ""+nonDup.charAt(i) + num;

        }



        return result;

    }

    public static String frequencymix(String str){
        Set<String> list=new LinkedHashSet<>(Arrays.asList(str.split("")));
        String nonDup=list.toString(); //[A,B,C,D,c]

        System.out.println(nonDup);

        nonDup = nonDup.replace(", ","").replace("[","").replace("]","");

        String result="";

        for(int i=0; i < nonDup.length(); i++) {

            int num = Collections.frequency( Arrays.asList(str.split("") ) ,    ""+nonDup.charAt( i ) );

            result += ""+nonDup.charAt(i) + num;

        }
        return result;
    }

}
