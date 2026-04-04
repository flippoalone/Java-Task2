package Strings;

public class SubString {

    public static void main(String[] args) {

        String s = "ADOBECODEBANC";
        String t = "ABC";

        String result = "";

        for (int i = 0; i < s.length(); i++) {
            int[] count = new int[128];


            for (char c : t.toCharArray()) {
                count[c]++;
            }

            int needed = t.length();


            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);

                if (count[c] > 0) {
                    needed--;
                }
                count[c]--;


                if (needed == 0) {
                    String sub = s.substring(i, j + 1);

                    if (result.equals("") || sub.length() < result.length()) {
                        result = sub;
                    }
                    break;
                }
            }
        }

        System.out.println(result);
    }
}
