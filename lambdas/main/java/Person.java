import java.time.LocalDate;

public class Person {
    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public enum Sex {
        MALE, FEMALE
    }

    public int getAge() {
        // return current date - birthday in years
        return -1;
    }

    public void printPerson() {
        // dunno what this does...
    }

}
