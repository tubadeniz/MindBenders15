package interviewQ_part1;
//Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
public class frequency {
    public static void main(String[] args) {
        String str = "AAABBCDD";
        System.out.println(FrequencyOfChars(str));
    }


    public static String FrequencyOfChars(String str){
        String nonDup="";//ABCD
        for(int i=0;i<str.length();i++){
            if(!nonDup.contains(""+str.charAt(i))){
                nonDup+=str.charAt(i);
            }
        }

        String result="";
        for(int j=0;j<nonDup.length();j++){
            int count=0;
            for(int k=0;k<str.length();k++){
                if(nonDup.charAt(j)==str.charAt(k)){
                    count++;
                }
            }
            result+=nonDup.charAt(j)+""+count;
        }
        return result;
    }

}
