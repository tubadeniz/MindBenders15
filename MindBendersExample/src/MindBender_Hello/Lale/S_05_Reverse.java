package MindBender_Hello.Lale;

public class S_05_Reverse {

  /*
  Write a return method that can reverse  String

Ex: Reverse("ABCD"); ==> DCBA
 */


    public static void main(String[] args) {

        String str =  reverse("zakaz");
        String result ="ZakAZ";
        System.out.println(str);

        boolean polindrome = str.equalsIgnoreCase(result);
        System.out.println(polindrome);

    }

    public static String reverse(String str){
        String result="";

        for (int i = str.length()-1; i >=0 ; i--) {
            result+= str.charAt(i);

        }
        return result;
    }


}
