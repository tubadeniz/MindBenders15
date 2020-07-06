package MindBender_Hello.Lale;

public class S_13_Finra {

    /*
    Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
     print "FIN" instead of the number and for numbers which are a multiple of 5,
      print "RA" instead of the number. for numbers which are a multiple of both 3 and 5,
      print "FINRA" instead of the number.
     */

    public static void Finra(){

        String result ="";
        for (int i = 0; i <30 ; i++) {
            if(i%3==0){
                result="FIN";
            } if(i%5==0){
                result="RA";
            }if(i%3==0 && i%5==0){
                result="FINRA";
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        //int num=29;
        //System.out.println(Finra(num));
        String result ="";
        for (int i = 0; i <30 ; i++) {
            if(i%3==0){
                result+="FIN";
            } if(i%5==0){
                result+="RA";
            }if(i%3==0 && i%5==0){
                result+="FINRA";
            }
        }
        System.out.println(result);
    }
}
