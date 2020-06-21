package interviewQ_part1;

public class RemoveDup2 {
    public static void main(String[] args) {
        System.out.println(remove("Irfan Selim Aksit"));
    }

    public static String remove(String str){
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            if(!result.contains(str.charAt(i)+"")){
                result+= str.charAt(i);
            }
        }
        return result;
    }
}
