package Задача_A;

public class Main {
    public static void main(String[] args) {
        User user = new User("Oleg Ivanovich", "Oleg199944201", -23, "Oleglubitpitsu", true);
        user.setInitials("Oleg Ivanovich");
        user.setLogin("Oleg199944201");
        user.setAge(23);
        user.setPassword("Oleglubitpitsu");
        user.setIfProfileBlocked(true);
        System.out.println("Инициалы: " + user.getInitial());
        System.out.println("Логин: " + user.getLogin());
        System.out.println("Возраст: " + user.getAge());
        System.out.println("Пароль: " + user.getPassword());
        System.out.println("Заблокированна ли учетная запись: " + user.isIfProfileBlocked() + (" (нет)"));
    }
}
