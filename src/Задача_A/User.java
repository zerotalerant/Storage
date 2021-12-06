package Задача_A;

public class User {
    public String initial;
    public String login;
    public int age;
    public String password;
    public boolean ifProfileBlocked;

    public User(){

    }

    public User(String initial, String login, int age, String password, boolean ifProfileBlocked) {
        this.initial = initial;
        this.login = login;
        this.age = age;
        this.password = password;
        this.ifProfileBlocked = ifProfileBlocked;
    }

    public String getInitial() {
        return initial;
    }

    public void setInitials(String initial) {
        this.initial = initial;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Возраст не может быть отрицательным числом!");
        } else {
            this.age = age;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isIfProfileBlocked() {
        return ifProfileBlocked;
    }

    public void setIfProfileBlocked(boolean ifProfileBlocked) {
        this.ifProfileBlocked = ifProfileBlocked;
    }

    @Override
    public String toString() {
        return initial + " " + login + " " + age + " " + password + " " + ifProfileBlocked;
    }
}
