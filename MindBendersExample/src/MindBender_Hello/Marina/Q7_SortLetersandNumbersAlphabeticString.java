package MindBender_Hello.Marina;

import java.util.Arrays;

public class Q7_SortLetersandNumbersAlphabeticString {

    public static void SortLettersAndNumbersFromString(String str) {  //1.write new method "DC501GCCCA098911"

        String str2 = "";  //2. create a new String

        for (int i = 0; i < str.length(); i++) {  // create regular loop and runing this String "DC501GCCCA098911"

            str2 += "" + str.charAt(i);  //divide all characters and add them on new String

            if (Character.isAlphabetic(str.charAt(i)) && i < str.length() - 1) { //if some of Character will be letters and less then last character

                if (Character.isDigit(str.charAt(i + 1))) { // then if Character is number

                    str2 += ",";  // add comma between  numbers

                }

            }


            if (Character.isDigit(str.charAt(i)) && i < str.length() - 1) {  // if Character is digits and less then last Character

                if (Character.isAlphabetic(str.charAt(i + 1))) {  // if Character is letters

                    str2 += ","; //add comma between numbers

                }

            }

        }//after that loop and if statement output will be "DC, 501, GCCCA, 098911"

        String[] arr = str2.split(",");  //then all letters and numbers separated {"DC", "501", "GCCCA", "098911"}

        str = "";

        for (String each : arr) {  //loop for array {"DC", "501", "GCCCA", "098911"}

            char[] chars = each.toCharArray();  //takes part of array "DC"

            Arrays.sort(chars);  //and then sorted part

            for (char eachChar : chars) { //then this sorted part aded one by one in String

                str += "" + eachChar;

            }

        }

        System.out.println(str);

    }

    public static void main(String[] args) {
        SortLettersAndNumbersFromString("DC501GCCCA098911");
    }

}
