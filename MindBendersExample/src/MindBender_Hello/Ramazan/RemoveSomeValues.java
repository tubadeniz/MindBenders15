package interviewQ_part1;

import java.util.ArrayList;
import java.util.Arrays;

//remove greater than 100
public class RemoveSomeValues {
    public static void main(String[] args)  {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));
//        int n = list.size();
//        for (int each:list) {
//            if(each>100){
//                list.remove(each);
//            }
//        }
//        System.out.println(list);
//
//        System.out.println(list);


        //Another solution
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));
        list2.removeIf(p -> p > 100);
        System.out.println(list2);
        }
    }

