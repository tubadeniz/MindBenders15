package MindBender_Hello.Lale;

public class S_06_SumOfDigits {

    /*
Write a method that can return the sum of the digits in a string


 */

    public static void main(String[] args) {
        System.out.println(sumOfDigit("12AB34CV"));
    }

    public static int sumOfDigit(String str){
        int t=0;
        for(int i=0;i<str.length();i++){    //str="123"
            //System.out.print(str.charAt(i)-'0');
            //if(Character.isDigit(str.charAt(i)))
            if(str.charAt(i)>=48 && str.charAt(i)<=57) //digits
                //if((str.charAt(i)>=65 && str.charAt(i)<=90) || (str.charAt(i)>=97 && str.charAt(i)<=122)) upper case \\ lower case letters
                t += str.charAt(i)-'0';  //'o'=Integer.valueOf(""+each) convert to string
            else{
                System.out.println(str.charAt(i));
            }
        }

        return t;
    }

}
