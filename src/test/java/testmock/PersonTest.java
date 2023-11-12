package testmock;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class PersonTest {

    @Test
    public void testGetFullName() {
        // Arrange
        Person person = new Person("Srikanth", "Bussa");

        // Act
        String fullName = person.getFullName();

        // Assert
        assertEquals("Srikanth Bussa", fullName);
    }

    @Test
    public void testGetAge() {
        // Arrange
        Person person = new Person("Ram", "Jilla");
        person.setAge(36);

        // Act
        int age = person.getAge();

        // Assert
        assertEquals(35, age);
    }

    @Test
    public void testIsAdultForAdultPerson() {
        // Arrange
        Person adultPerson = new Person("David", "North");
        adultPerson.setAge(30);

        // Act
        boolean isAdult = adultPerson.isAdult();

        // Assert
        assertTrue(isAdult);
    }

    @Test
    public void testIsAdultForChildPerson() {
        // Arrange
        Person childPerson = new Person("Newberry", "Ethics");
        childPerson.setAge(10);

        // Act
        boolean isAdult = childPerson.isAdult();

        // Assert
        assertFalse(isAdult);
    }

    @Test
    public void testGetFullNameWithMock() {
        // Arrange
        Person personMock = mock(Person.class);
        when(personMock.getFullName()).thenReturn("Griffin");

        // Act
        String fullName = personMock.getFullName();

        // Assert
        assertEquals("D Griffin", fullName);
    }
}