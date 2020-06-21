package interviewQ_part1;

public class DivisibleBy3515_2 {
    public static void main(String[] args) {
        String div15 = "";
        String div5 = "";
        String div3 = "";
        int[] arr = new int[100];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = i+1;
        }
        for(int each:arr){
            if(each%3==0 && each%5==0){
                div15+=each+" ";
            }else if(each%5==0 && each%3!=0){
                div5+=each+" ";
            }else if(each%3==0 && each%5!=0){
                div3+= each+" ";
            }
        }
        System.out.println("Divisible by 15: "+div15);
        System.out.println("Divisible by 5: "+div5);
        System.out.println("Divisible by 3: "+div3);
    }
}
