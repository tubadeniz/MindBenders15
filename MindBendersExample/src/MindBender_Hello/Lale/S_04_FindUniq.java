package MindBender_Hello.Lale;

public class S_04_FindUniq {
       /*
    Write a return  method that can find the unique characters from the String

Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
     */

    public static void main(String[] args) {
/*
        Scanner scan = new Scanner(System.in);

                System.out.println("Enter your word");

        String str = scan.next();
        String uniq="";
       // String result ="";


        for (int i = 0; i <str.length() ; i++) {
           // char ch = str.charAt(i);
             int count=0;
            for (int j = 0; j < str.length(); j++) {
               // char ch2 = str.charAt(j);
                if (str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count==1)
            uniq+= ""+ str.charAt(i);
        }
        System.out.println(uniq);
*/

        String str = "ABBCCD";
        uniq2(str);

    }

    public static void uniq(String str){     //ABBCCD   //result=AD

        String result ="";
        for (int i = 0; i <str.length() ; i++) {      //ABBCCD
            char ch = str.charAt(i);
            int count =0;
            for (int j = 0; j <str.length() ; j++) {  //ABBCCD
                char ch2 = str.charAt(j);
                if (ch == ch2) {
                    count++;
                }
            }
            if ((count==1)){
                result+=""+ ch;     //why we put result+= intead of result=
            }
        }

        System.out.println(result);



    }

    public static void uniq2(String str){     //ABBCCD   //result=AD

        String result ="";
        // indexOf(D)=5, lastIndexOf(D)=5

        for(int i=0;i<str.length();i++){
            if(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))){
                result += ""+str.charAt(i);
            }
        }
        System.out.println(result);


    }
}
