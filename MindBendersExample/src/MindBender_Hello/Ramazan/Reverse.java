package interviewQ_part1;
//Ex: Reverse("ABCD"); ==> DCBA
public class Reverse {
    public static void main(String[] args) {
        String str = "ABCD";
        String result = "";
        for (int i = str.length()-1; i >=0; i--) {
            result+=str.charAt(i);

        }
        System.out.println(result);
    }
}
