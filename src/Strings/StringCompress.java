package Strings;

public class StringCompress {
    public static void main(String[] args) {

        String s = "aaabbccccd";
        String result = "";

        int count = 1;

        for (int i = 0; i < s.length(); i++) {

            // check next character
            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                result = result + s.charAt(i) + count;
                count = 1; // reset count
            }
        }

        System.out.println(result);

    }
}
