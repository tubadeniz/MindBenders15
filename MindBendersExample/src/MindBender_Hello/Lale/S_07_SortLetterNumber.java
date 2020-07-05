package MindBender_Hello.Lale;

import java.util.ArrayList;
import java.util.Collections;

public class S_07_SortLetterNumber {
      /*
    Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together

Ex:

Input:  "DC501GCCCA098911"
char=
digit=
output: CD015ACCCG011899
OutPut: "CD015ACCCG011899"
     */

    public static void main(String[] args) {

        //sortLetNum("DC501GCCCA098911");
        sortLetNum2("DC501GCCCA098911");

    }

    public static void sortLetNum(String str){
        ArrayList<String> character = new ArrayList<>();
        ArrayList<String> digit = new ArrayList<>();
        String output="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>=48 && str.charAt(i)<=57){ //DC   // -> GCCCA
                Collections.sort(character); //CD   //-> ACCCG
                for(int j=0;j<character.size();j++){ //CD.SIZE      //ACCCG.size()
                    output += ""+character.get(j); //CONCATE INTO OUTPUT
                }
                character = new ArrayList<>(); // SIFIRLAYAS TAZE ISLEM UN
                digit.add(""+str.charAt(i)); // DIGITI CONCATE ETYAS   ->501        //098911
            }
            else{
                Collections.sort(digit);  //->015
                for(int j=0;j<digit.size();j++){//015.SIZE
                    output += ""+digit.get(j); //CONCATE INTO OUTPUT
                }
                digit = new ArrayList<>(); //SIFIRLAYAS TAZE ISLEM UN
                character.add(""+str.charAt(i)); //TAZE ISLEME BASLAYAS -> GCCCA
            }
        }
        //for dan son arraylist biri doly biri bos bolya. son un make sure bolmak un ikisinem sort edip loop edip onku
        //outpudyn ustune gosyas.
        Collections.sort(digit);
        Collections.sort(character);
        for(int i=0;i<digit.size();i++){
            output+=""+digit.get(i);
        }
        for(int i=0;i<character.size();i++){
            output+=""+character.get(i);
        }
        System.out.println(output);
    }




    public static void sortLetNum2(String str){

        ArrayList<String> character = new ArrayList<>();
        ArrayList<String> digit = new ArrayList<>();
        String result = "";

        for(int i=0; i<str.length(); i++){


            if(Character.isAlphabetic(str.charAt(i)) && Character.isAlphabetic(str.charAt(str.length()-1))){
                Collections.sort(character);

                for (int j=0; j<character.size(); i++){
                    result+=""+character.get(j);
                }
                character= new ArrayList<>();
                digit.add(""+str.charAt(i));

            }

            else{
                Collections.sort(digit);
                for(int j=0; j<digit.size(); j++){
                    result+=""+digit.get(j);
                }
                digit=new ArrayList<>();
                character.add(""+str.charAt(i));
            }
        }

        Collections.sort(character);
        Collections.sort(digit);

        for(int i=0; i<character.size(); i++){
            result+=""+character.get(i);
        }
        for(int i=0; i<digit.size(); i++){
            result+=""+digit.get(i);
        }
        System.out.println(result);


    }
}
