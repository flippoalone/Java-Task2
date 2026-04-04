package ArrayList;

import java.util.ArrayList;

public class RemoveElement {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // Adding elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(2);

        int element = 2;

        // Remove all occurrences
        list.removeIf(n -> n == element);

        System.out.println(list);
    }
}
