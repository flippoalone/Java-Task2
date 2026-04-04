package Map_Set_Assignment;

import java.util.HashMap;

public class Frequency {

    public static void main(String[] args) {

        String s = "aabbc";
        HashMap<Character, Integer> freq = new HashMap<>();

        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        System.out.println(freq);
    }

}
