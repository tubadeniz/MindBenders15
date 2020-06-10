package MindBender_Hello.Lale;

public class S_01_FrequencyOfString {
       /*
      Write a return method that can find the frequency of characters

Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    public static void main(String[] args) {

        // String berlen="";

        String hh =  freq2("AAABBCDDF");   //ABCDF // A3
        System.out.println(hh);
       /*
        int count =0;
        while (nonDup.contains(berlen)){
            count++;
            result+=""+ nonDup+count;

        }
        System.out.println(result);
*/
    }
    public static String freq(String str){
        String nonDup = "";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if(!nonDup.contains(""+str.charAt(i))){
                nonDup+=str.charAt(i);
            }
        }
        //System.out.println(nonDup);      // hersinden 1 ni alyp remove duplicate ettik ->> ABCD

        for (int i = 0; i <nonDup.length() ; i++) { //ABCDF
            //  char ch = nonDup.charAt(i);
            int count=0;
            //  System.out.println(ch);  //ABCD
            for (int j = 0; j <str.length(); j++) { //AAABBCDDF
                if(str.charAt(j)==nonDup.charAt(i)){
                    count++;
                }
            }
            result+= ""+nonDup.charAt(i)+count;
        }
        //return result;
        return result;
    }

    public static String freq2(String str){
        // CDDF
        String searched = "";
        String result = "";
        for (int i = 0; i < str.length() ; i++) {

            if(!searched.contains(""+str.charAt(i))) {
                int count =0;
                for (int j = 0; j < str.length(); j++) {
                    if(str.charAt(i)==str.charAt(j)){
                        count++;
                    }
                }
                result += ""+str.charAt(i)+count;
                searched += ""+str.charAt(i)+count;
            }
        }
        return searched;
    }
//dnjdncdndmnmd m
}


