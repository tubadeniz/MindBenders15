package interviewQ_part1.Practice;

public class Reverse_Word {
    public static void main(String[] args) {
        String str = "I came to home";//input
        String result = "";//output

        for (int i =str.length()-1 ; i >=0 ; i--) {
            result+=str.charAt(i);
        }
        System.out.println(result);

    }

}
