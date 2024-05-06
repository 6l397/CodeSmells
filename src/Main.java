import lab5.EmailService;
import lab5.User;
import lab5.UserListProcessor;
import lab5.task2.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println("---------------Task1---------------");
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

        //Task 2
        System.out.println("---------------Task2---------------");
        System.out.println("---------------Order---------------");
        List<String> items = List.of("Moisturizer", "SPF", "Toner");
        OrderProcessor orderProcessor = new OrderProcessor(items);
        double totalPrice = orderProcessor.calculateTotalPrice();
        Order order = new Order("Amina", items, totalPrice);
        order.processOrder();

        System.out.println("--------------Person---------------");
        Person person = new Person("Amina", 19, "Female");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());

        Relationships relationships = new Relationships();
        relationships.addFriend("Sergiy");
        relationships.addFriend("Polina");
        relationships.addEnemy("Sasha");
        Tasks tasks = new Tasks();
        tasks.addTask("Complete homework");
        tasks.addTask("Go shopping");

        System.out.println("Friends: " + relationships.getFriends());
        System.out.println("Enemies: " + relationships.getEnemies());
        System.out.println("Tasks: " + tasks.getTasks());
    }
}