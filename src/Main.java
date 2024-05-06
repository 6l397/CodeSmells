import lab5.EmailService;
import lab5.User;
import lab5.UserListProcessor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> usernames = new ArrayList<>();
        usernames.add("amina_s");
        usernames.add("artem_il");
        usernames.add("sergiy");

        UserListProcessor userListProcessor = new UserListProcessor(usernames);

        System.out.println("Processing user list:");
        userListProcessor.processUserList();
        System.out.println();

        int adminCount = userListProcessor.countAdminUsers();
        System.out.println("Number of admin users: " + adminCount);
        System.out.println();

        User newUser = new User("polina", "polina2005@google.com", "123456789", "Nebesnoi Sotni 4B");
        userListProcessor.addUser(newUser);

        String subject = "Welcome to our platform!";
        String body = "Dear " + newUser.getUsername() + ", welcome to our platform.";

        EmailService emailService = new EmailService();
        emailService.sendEmail(newUser, subject, body);

        User newAdmin = new User("admin_u", "admin@google.com", "admin", "Golovna 12");
        userListProcessor.addUser(newAdmin);

        System.out.println("\nUpdated user list:");
        userListProcessor.processUserList();
    }
}