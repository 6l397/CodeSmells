package lab5;

import java.util.ArrayList;

public class AdminCounter {
    private ArrayList<String> usernames;

    public AdminCounter(ArrayList<String> usernames) {
        this.usernames = usernames;
    }

    public int countAdmins() {
        int adminCount = 0;
        for (String username : usernames) {
            if (username.contains("admin")) {
                adminCount++;
            }
        }
        return adminCount;
    }
}
