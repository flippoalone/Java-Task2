package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class RotateArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5);

        int K = 2;

        // Rotate list to right by K positions
        Collections.rotate(list, K);

        System.out.println(list);
    }

}
