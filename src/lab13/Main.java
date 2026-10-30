package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws AuthenticationException {
        try {
            User incorrectUser1 = new User("egor", "incorrect", "password", 18);
        } catch (InvalidUserDataException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getField());
        }
        System.out.println("----------");

        try {
            User incorrectUser2 = new User("egor", "incorrect", "pass", 18);
        } catch (InvalidUserDataException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getField());
        }
        System.out.println("----------");

        User user1 = new User("egor", "egor@gmail.com", "password", 18);
        User user2 = new User("alexey", "alexey@gmail.com", "strongpass", 20);
        User user3 = new User("vanya", "vanya@gmail.com", "password", 18);

        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);

        try {
            user1.authenticate("incorrect");
        } catch (AuthenticationException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getAttemptedPassword());
        }
        user2.authenticate("strongpass");

        System.out.println("----------");
        try {
            user1.updateEmail("incorrect");
        } catch (InvalidUserDataException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getField());
        }
        user1.updateEmail("new@gmail.com");
    }
}
