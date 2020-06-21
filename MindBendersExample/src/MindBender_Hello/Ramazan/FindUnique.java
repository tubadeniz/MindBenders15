package interviewQ_part1;
//Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
public class FindUnique {
    public static void main(String[] args) {
        System.out.println(unique("AAABBBCCCDEF"));
    }

    public static String unique(String str){
        String result="";
        String nunDup="";
        for(int i=0;i<str.length();i++){
            if(!nunDup.contains(""+str.charAt(i))){
                nunDup+=str.charAt(i);
            }
        }
        for(int i=0;i<nunDup.length();i++){
            int count=0;
            for(int j=0;j<str.length();j++){
                if(nunDup.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                result+=nunDup.charAt(i);
            }
        }return result;
    }
}
