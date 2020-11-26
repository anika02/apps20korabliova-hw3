package ua.edu.ucu;

import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testToString() {
        Student students = new Student("Ivar",
                "Grimstad", 3.9, 2);
        String actualRes = students.toString();
        String expectedRes =
                "Student{name=Ivar, surname=Grimstad, GPA=3.9, year=2}";

        assertEquals(expectedRes, actualRes);
    }

    @Test
    public void testHashCode() {
        Student students1 = new Student("Ivar",
                "Grimstad", 3.9, 2);
        Student students2 = new Student("Ivar",
                "Grimstad", 3.9, 2);

        assertEquals(students1.hashCode(), students2.hashCode());
    }
}
