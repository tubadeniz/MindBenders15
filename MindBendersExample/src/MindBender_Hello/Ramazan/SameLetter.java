package interviewQ_part1;
/*
Ex:  same("abc",  "cab"); -> true

same("abc",  "abb"); -> false:
 */
public class SameLetter {
    public static void main(String[] args) {
        String str1="abc";
        String str2="cab";
        System.out.println(same(str1,str2));
    }

    public static boolean same(String str1, String str2){
        String nunDup1="";
        String nunDup2="";
        for(int i=0;i<str1.length();i++){
            if(!nunDup1.contains(""+str1.charAt(i))){
                nunDup1+=str1.charAt(i);
            }
        }
        for(int i=0;i<str2.length();i++){
            if(!nunDup2.contains(""+str2.charAt(i))){
                nunDup2+=str2.charAt(i);
            }
        }
        for(int j=0;j<nunDup1.length();j++){
            if(nunDup1.contains(""+nunDup2.charAt(j))){
                return true;
            }
        }return false;

    }
}
