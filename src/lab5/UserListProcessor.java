package lab5;

import java.util.ArrayList;

public class UserListProcessor {
    private ArrayList<String> usernames;

    public UserListProcessor(ArrayList<String> usernames) {
        this.usernames = usernames;
    }

    public void processUserList() {
        for (String username : usernames) {
            processUser(username);
        }
    }

    private void processUser(String username) {
        System.out.println("Processing user: " + username);
        if (username.contains("admin")) {
            System.out.println("Admin user detected!");
        }
    }

    public int countAdminUsers() {
        AdminCounter counter = new AdminCounter(usernames);
        return counter.countAdmins();
    }

    public void addUser(User user) {
        String username = user.getUsername();
        if (!usernames.contains(username)) {
            usernames.add(username);
            System.out.println("User added: " + username);
        } else {
            System.out.println("User already exists: " + username);
        }
    }

}
