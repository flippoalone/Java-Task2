package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SecondLargest {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 5, 2, 9, 1, 7);

        // Sort the list
        Collections.sort(list);

        // Second largest element
        int secondLargest = list.get(list.size() - 2);

        System.out.println("Second largest element: " + secondLargest);
    }

}
