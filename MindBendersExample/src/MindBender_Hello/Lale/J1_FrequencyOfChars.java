package MindBender_Hello.Lale;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class J1_FrequencyOfChars {
    //Write a return method that can find the frequency of characters
    //
    //Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

    public static void main(String[] args) {
        String str="AAABBCDD";
        System.out.println(FrequencyOfChars(str));
        System.out.println(FrequencyOfChars2(str));


    }
    public static String FrequencyOfChars(String str) {
        String nonDub="";


        for (int i=0; i<str.length() ; i++){
            if (!nonDub.contains(""+str.charAt(i))) nonDub += str.charAt(i) ; //ABCD
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
            result +=""+nonDub.charAt(i)+count; //A3B5


        }


        return result;

    }
    public  static  String  FrequencyOfChars2(String str) {

        String b=new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();

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

}