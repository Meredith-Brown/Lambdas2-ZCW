import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class PersonTest {

    @org.junit.jupiter.api.Test
    void getAge() {
        // given
        Person meredith = new Person("Meredith", LocalDate.of(1992, 10, 02),
                Person.Sex.FEMALE, "meredithbrown302@gmail.com");
        // when
        int actual = meredith.getAge();
        // then
        Assert.assertEquals(29, actual);
    }

    @Test
    void printPerson() {
    }
}