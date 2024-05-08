import lab5.User;
import lab5.UserListProcessor;
import lab5.task2.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Task 1

        System.out.println("---------------Task1---------------");

        List<User> users = new ArrayList<>();
        users.add(new User("user1", "user1@example.com", "password1", "Address 1"));
        users.add(new User("admin1", "admin1@example.com", "password2", "Address 2"));
        users.add(new User("user2", "user2@example.com", "password3", "Address 3"));
        UserListProcessor processor = new UserListProcessor(users);
        System.out.println("Processing user list:");
        processor.processUserList();
        long adminCount = processor.countAdminUsers();
        System.out.println("Number of admin users: " + adminCount);
        User newUser = new User("newuser", "newuser@example.com", "password4", "New Address");
        processor.addUser(newUser);
        System.out.println("\nProcessing user list after adding a new user:");
        processor.processUserList();

        //Task 2
        System.out.println("---------------Task2---------------");
        System.out.println("---------------Order---------------");
        List<Item> items = new ArrayList<>();
        items.add(new Item("Moisturizer", 10.0));
        items.add(new Item("SPF", 15.0));
        items.add(new Item("Toner", 20.0));
        Order order = new Order("Customer", items);
        order.processOrder();

        System.out.println("--------------Person---------------");
        Relationships relationships = new Relationships();
        relationships.addFriend("Nata");
        relationships.addEnemy("Alex");
        Tasks tasks = new Tasks();
        tasks.addTask("Complete homework");
        tasks.addTask("Wash up dishes");
        Person person = new Person("Amina", 19, "Female");
        person.addRelationship(relationships);
        person.addTask(tasks);
        System.out.println("Person: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());
        System.out.println("Relationships: " + person.getRelationships());
        System.out.println("Tasks: " + person.getTasks());
    }
}