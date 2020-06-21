package interviewQ_part1;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAhmet {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Ahmet", "Eric", "Ali", "Ahmet"));
        list.removeAll(Arrays.asList("Ahmet"));
        System.out.println(list);

        // diger cozum
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
                names.removeAll( Arrays.asList("Ahmed"));
                System.out.println(names);
    }


}
