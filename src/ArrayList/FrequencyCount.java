package ArrayList;

import java.util.ArrayList;
import java.util.HashMap;

public class FrequencyCount {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);

        // Use HashMap to store frequency
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : list) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Print frequencies
        for (int key : freqMap.keySet()) {
            System.out.println(key + " → " + freqMap.get(key));
        }
    }

}
