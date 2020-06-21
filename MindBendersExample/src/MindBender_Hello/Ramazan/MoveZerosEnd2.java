package interviewQ_part1;

import java.util.ArrayList;

/*
Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)

Ex:

input:  {1,0,2,0,3,0,4,0};

output: [1, 2, 3, 4, 0, 0, 0, 0]
 */
public class MoveZerosEnd2 {
    public static void main(String[] args) {
        int[] arr1 = {1,0,2,0,3,0,4,0};
        System.out.println(move(arr1));
    }
    public static ArrayList<Integer> move(int[] arr){//bi array i arraylist e nasil eklersin>>for loop ile asagidaki gibi
        ArrayList<Integer> list = new ArrayList<>();
        for(int each:arr){
            list.add(each);
        }
        int count=0;
        for (int i = 0; i < list.size(); i++) {

                if(list.get(i)==0){
                   list.remove(list.get(i));
                   count++;
                }
                
        }
        for (int i = 0; i <count ; i++) {
            list.add(0);
        }
        return list;
    }
}
