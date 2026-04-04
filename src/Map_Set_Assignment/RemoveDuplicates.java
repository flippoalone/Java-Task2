package Map_Set_Assignment;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<String> emails = new ArrayList<>();
        emails.add("alice@example.com");
        emails.add("bob@example.com");
        emails.add("alice@example.com");
        emails.add("charlie@example.com");
        emails.add("bob@example.com");

        // Use HashSet to remove duplicates
        HashSet<String> uniqueEmails = new HashSet<>(emails);

        // Convert back to list (optional)
        ArrayList<String> uniqueList = new ArrayList<>(uniqueEmails);

        System.out.println(uniqueList);
    }

}
