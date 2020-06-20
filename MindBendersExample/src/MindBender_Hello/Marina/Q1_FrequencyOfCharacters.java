package MindBender_Hello.Marina;

public class Q1_FrequencyOfCharacters {
    public static String FrequensyOfChars(String str) { //return method with 1 arg-String
       String nonDupl = ""; //new String nonDuplicate
       for (int i = 0; i < str.length(); i++) {  //loop for String Str
           if (!nonDupl.contains("" + str.charAt(i))) { // if String nonDupl  NOT contains String str
               nonDupl += str.charAt(i); //add in String nonDupl every SINGLE char (String str)
               //String nonDupl = "ABCD";
           }
       }
        System.out.println(nonDupl);

       String result = ""; // 2nd String result
       for (int j = 0; j < nonDupl.length(); j++) { // 2nd loop for String nonDupl
           int count = 0;  //create int count in loop
           for (int i = 0; i < str.length(); i++) { // 3rd loop for String str
               if (nonDupl.charAt(j) == str.charAt(i)) {  //if  Char(String nonDupl) equal char (String str)
                   count++; // count every duplicates
               }

           }
           result += nonDupl.charAt(j) +""+ count; //add in String result Char(String nonDupl) and add every counted duplicate
       }
       return result;
   }
    public static void main(String[] args) {

        System.out.println(FrequensyOfChars("AABBCDD"));
    }

}
