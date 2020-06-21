package interviewQ_part1;

public class RemoveDup {
    public static void main(String[] args) {
    //Ex:  removeDup("AAABBBCCC")  ==> ABC
        String str = "AAABBBCCC";
        System.out.println(remove(str));
    }


    public static String remove(String str){
        String nunDup="";
        for(int i=0;i<str.length();i++){
            if(!nunDup.contains(""+str.charAt(i))){
                nunDup+=str.charAt(i);
            }
        }return nunDup;
    }
}
