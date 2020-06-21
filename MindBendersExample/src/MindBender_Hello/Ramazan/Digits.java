package interviewQ_part1;

public class Digits {
    public static void main(String[] args) {
        String str = "1A2B3C";
        String strResult="";
        String str2="";
        for (int i = 0; i <str.length() ; i++) {
            if(Character.isDigit(str.charAt(i))){
                strResult+=str.charAt(i);
            }
        }
        for (int i = 0; i <str.length() ; i++) {
            if(Character.isAlphabetic(str.charAt(i))){
                str2+=str.charAt(i);
            }
        }
        System.out.println(strResult);
        System.out.println(str2);
    }
}
