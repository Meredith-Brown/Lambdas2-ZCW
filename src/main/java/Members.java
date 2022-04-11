import java.util.ArrayList;
import java.util.List;

public class Members {
    List<Person> membersList = new ArrayList<>();

    public static void printPersonsOlderThan(List<Person> membersList, int age) {
        for (Person p : membersList) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }
    }

    public static void printPersonsYoungerThan(List<Person> membersList, int age) {
        for (Person p : membersList) {
            if (p.getAge() < age) {
                p.printPerson();
            }
        }
    }

    public static void printPersonsByAge(List<Person> membersList, int age) {
        for (Person p : membersList) {
            if (p.getAge() == age) {
                p.printPerson();
            }
        }
    }

    public static void printPersonsByGender(List<Person> membersList, Person.Sex sex) {
        for (Person p : membersList) {
            if (p.gender.equals(sex)) {
                p.printPerson();
            }
        }
    }

    public static void printPersonsWithinAgeRange(List<Person> membersList, int lowAge, int highAge) {
        for (Person p : membersList) {
            if (p.getAge() >= lowAge && p.getAge() <= highAge) {
                p.printPerson();
            }
        }
    }

    public static void printPersonsOfGenderWithinAgeRange(List<Person> membersList, int lowAge,
        int highAge, Person.Sex sex) {
        for (Person p : membersList) {
            if (p.getAge() >= lowAge && p.getAge() <= highAge && p.gender.equals(sex)) {
                p.printPerson();
            }
        }
    }

}

// What if you decide to change the Person class and add other attributes such as relationship
// status or geographical location? Although this method is more generic than printPersonsOlderThan,
// trying to create a separate method for each possible search query can still lead to brittle code.
// You can instead separate the code that specifies the criteria for which you want to search in a
// different class.