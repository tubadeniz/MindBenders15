package MindBender_Hello.Zeynep;

public class OddEven {

    public static void main(String[] args) {

       int[] arr = {1,11,22,33,44,4,55,65,78,97,45,32,24,66};

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] %2 == 0){
                System.out.println("even: "+ arr[i]);
            }

            if (arr[i] %2 !=0){
                System.out.println("odd: "+arr[i]);
            }
        }








    }
}
