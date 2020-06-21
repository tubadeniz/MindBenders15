package interviewQ_part1;

import java.util.Arrays;

//Input:  "DC501GCCCA098911"
//
//OutPut: "CD015ACCCG011899"
public class SortLettersNumbers2 {
    public static void main(String[] args) {
        String str = "CD501GCCCA098911";//CD,015,GCCC,
        String result1 = "";
        for (int i = 0; i < str.length(); i++) {
            result1+=str.charAt(i);
            if(Character.isDigit(str.charAt(i))&& i<str.length()-1){
                if(Character.isAlphabetic(str.charAt(i+1))){
                    result1+=",";
                }
            }
            System.out.println(result1);
            if(Character.isAlphabetic(str.charAt(i))&& i<str.length()-1){
                if(Character.isDigit(str.charAt(i+1))){
                    result1+=",";
                }
            }
        }
        String[] strArr = result1.split(",");
        String result2 = "";

        for(String each:strArr){
            char[] ch=each.toCharArray();
            Arrays.sort(ch);
            for(char each2:ch){
                result2+=each2;
            }
        }


        System.out.println(result2);


    }
}
