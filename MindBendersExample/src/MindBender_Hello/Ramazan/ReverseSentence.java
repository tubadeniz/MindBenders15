package interviewQ_part1.Practice;

public class ReverseSentence {
    public static void main(String[] args) {
        String str = "Ali eve geldi";
        String[] arrStr = str.split(" ");
        String result = "";
        for (int i = arrStr.length-1; i >=0 ; i--) {
            result+=" "+arrStr[i];
        }
        System.out.println(result);
    }
}
