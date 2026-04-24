package programs;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class WriteAJavaProgramToReverseALinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>(List.of(10,20,30,40,50,60));

        Collections.reverse(list);
        System.out.println(list);

        //OR

        LinkedList<Integer> reversed = new LinkedList<>();

        for(Integer num : list) {
            reversed.addFirst(num);
        }

        System.out.println("Reversed List: " + reversed);


    }
}
