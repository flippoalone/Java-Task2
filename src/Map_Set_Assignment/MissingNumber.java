package Map_Set_Assignment;

import java.util.ArrayList;

public class MissingNumber {

    public static void main(String[] args) {

        int N = 10;
        int[] arr = {1, 2, 4, 6, 7, 9};

        ArrayList<Integer> missing = new ArrayList<>();

        // Check each number from 1 to N
        for (int i = 1; i <= N; i++) {
            boolean found = false;
            for (int num : arr) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                missing.add(i);
            }
        }

        System.out.println("Missing numbers: " + missing);
    }

}
