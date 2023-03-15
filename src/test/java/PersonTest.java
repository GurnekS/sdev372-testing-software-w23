import org.example.src.people.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PersonTest
{
    @Test
    public void constructorTest()
    {
        Person testMe = new Person("Joe", "Smith");

        assertAll("The constructor does not set all fields correctly",
                () -> assertTrue("Joe", testMe.getFirst()),
                () -> assertTrue("Smith", testMe.getLast()),
                () -> assertNull(testMe.getTitle())
        );
    }

}
