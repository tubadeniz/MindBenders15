package interviewQ_part1;

public class DivisibleBy3515 {
    public static void main(String[] args) {
        System.out.print("Divisible by 15: ");
        for (int i = 1; i <=100 ; i++) {
            if(i%3==0 && i%5==0){
                System.out.print(+i+" ");
            }
        }
        System.out.println();
        System.out.print("Divisible by 3: ");
        for (int i = 1; i <=100 ; i++) {
            if(i%3==0 && i%5!=0){
                System.out.print(+i+" ");
            }
        }
        System.out.println();
        System.out.print("Divisible by 5: ");
        for (int i = 1; i <=100 ; i++) {
            if(i%3!=0 && i%5==0){
                System.out.print(+i+" ");
            }
        }
    }
}
