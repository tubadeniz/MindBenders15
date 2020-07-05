package MindBender_Hello.Lale;

public class S_03_RemoveDuplicates {

     /*
    Write a return method that can remove the duplicated values from String

Ex:  removeDup("AAABBBCCC")  ==> ABC
     */

    public static void main(String[] args) {

        removeDup("AAABBCCCDDDEFFFGHJJKLLLM");

        //System.out.println(str);

    }

    public static void  removeDup(String str){
        String remDup="";

        for (int i = 0; i <str.length(); i++) {

            if(!remDup.contains(""+str.charAt(i))){
                remDup+=str.charAt(i);
            }
        }
        System.out.println(remDup);
    }
}
