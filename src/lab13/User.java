package org.example;

public class User {
    private String username;
    private String email;
    private String password;
    private int age;

    public User(String username, String email, String password, int age) {
        if (!email.matches("^[\\w-\\.]+@[\\w-]+\\.[a-z]{2,}$")) {
            throw new InvalidUserDataException("Неверный формат email", "email");
        }

        if (password.length() < 6) {
            throw new InvalidUserDataException("Пароль не может быть короче 6 символов", "password");
        }

        this.username = username;
        this.email = email;
        this.password = password;
        this.age = age;
    }

    public void authenticate(String password) throws AuthenticationException {
        if (password != this.password) {
            throw new AuthenticationException("Неверный пароль!", password);
        }
        System.out.println("Успешная аутентификация пользователя " + username);
    }

    public void updateEmail(String newEmail) {
        if (!newEmail.matches("^[\\w-\\.]+@[\\w-]+\\.[a-z]{2,}$")) {
            throw new InvalidUserDataException("Неверный формат email", "email");
        }
        email = newEmail;
        System.out.println("Почта пользователя " + username + " изменена на " + newEmail);
    }
}
