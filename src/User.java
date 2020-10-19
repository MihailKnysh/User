import java.time.LocalDate;

public class User {
    private String login;
    private String firstName;
    private String lastName;
    private int age;
    private final LocalDate date;

    public User(String login, String firstName, String lastName, int age) {
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.date = LocalDate.now();
    }

    @Override
    public String toString() {
        return "\nUser{" +
                "login='" + login + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }
}
