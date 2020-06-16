package MindBender_Hello.Ramazan;

public class Reverse_Sentence {
    public static void main(String[] args) {
        String str = "Mike went to school";
        String[] arr = str.split(" ");
        String result = "";
        for (int i = arr.length-1; i >=0 ; i--) {
            result+=" "+arr[i];
        }
        System.out.println(result);
    }
}
