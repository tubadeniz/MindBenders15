package interviewQ_part1;

public class ConsecutiveNumbers {
    public static void main(String[] args) {
        int N = 30;
        for (int i = 1; i <=30 ; i++) {
            if(i%2==0 && i%3==0 && i%5==0) System.out.println("CodilityTestCoders");
            else if(i%2==0 && i%3==0 && i%5!=0) System.out.println("CodilityTest");
            else if(i%2==0 && i%3!=0 && i%5==0) System.out.println("CodilityCoders");
            else if(i%2!=0 && i%3==0 && i%5==0) System.out.println("TestCoders");
            else if(i%2==0 && i%3!=0 && i%5!=0) System.out.println("Codility");
            else if(i%2!=0 && i%3==0 && i%5!=0) System.out.println("Test");
            else if(i%2!=0 && i%3!=0 && i%5==0) System.out.println("Coders");
            else System.out.println(i);
        }


    }
}
