package MindBender_Hello.Shevgin.Interview;

public class J8 {
    //Write a method that can find the maximum number from an int Array

    public static void main(String[] args) {
        int [] arrNew={0,5,-5,8,7,55};
        System.out.println(maximum(arrNew));
    }

    public static int maximum(int []arr){
        int a=Integer.MIN_VALUE;
        for (int each:arr){
            if (each>a) a=each;
        }

        return a;
    }
}
