package MindBender_Hello.Tuba.Interview;

import java.util.ArrayList;

public class Sort_Descending {

    /* write a program that can print the list of integers in reversed order
    ex:
    list=> {1,2,3,4,5}
    output: 5 4 3 2 1

    */

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        for (int i =1; i < 6; i++){
            list.add(i);

        }
        System.out.println(list);


        ArrayList<Integer> reversedList = new ArrayList<>();
        for (int i = list.size()-1; i >= 0; i--){
            Integer eachNum= list.get(i); //unboxing
            reversedList.add(eachNum);
        }
        System.out.println(reversedList);


    }
}
