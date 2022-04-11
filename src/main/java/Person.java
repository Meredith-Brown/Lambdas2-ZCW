import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Person {
    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public Person(String name, LocalDate birthday, Sex gender, String emailAddress) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public enum Sex {
        MALE, FEMALE
    }

    public int getAge() {
        LocalDate today = LocalDate.now();
        return Period.between(birthday, today).getYears();
    }

    public void printPerson() {
        System.out.println("Name: " + this.name + ", Age: " + this.getAge() + ", Sex: " + this.gender +
                ", Email Address: " + this.emailAddress);
    }

}
