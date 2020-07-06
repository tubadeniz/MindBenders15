package MindBender_Hello.Lale;

public class S_08_FindMaxMIN {
      /*
    Write a method that can find the maximum number from an int Array
     */


    public static int Max(int [] num){
/*
        Arrays.sort(num);
        return num[num.length-1];
 */

        int max = Integer.MIN_VALUE;

        for (int each : num){
            if(each>max){
                max=each;
            }
        }
        return max;




    }

    public static void main(String[] args) {
        // System.out.println(Max(int {2,3,4,5,6,9}));
        int [] a = new int[4];
        a[0] = 4;
        a[1] = 2;
        a[2] = 3;
        a[3] = 1;
        //Max(a);
        int maximum = Max(new int[]{1, 2, 5, 3, 4});
        System.out.println(maximum);

    }
}
