package interviewQ_part1;

import java.util.ArrayList;
import java.util.Arrays;

public class SortAscending_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9,6,3,8,10,65,32));
        for (int i = 0; i <list.size()-1 ; i++) {
            for (int j = i+1; j <list.size() ; j++) {

                if(list.get(i)>list.get(j)){
                    int swap = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,swap);
                }
            }

        }
        System.out.println(list);

    }
}
