package interviewQ_part1;

public class SumOfDigitsInString {
    public static void main(String[] args) {
        String str = "a1b2c3";
        int total=0;
        char[] ch = str.toCharArray();
        for(char each:ch){
            if(Character.isDigit(each)){
                total+=Integer.parseInt(""+each);//total += Integer.valueOf(""+each);
                //we have to convert string to int with these methods.
            }
        }
        System.out.println(total);

    }
}
