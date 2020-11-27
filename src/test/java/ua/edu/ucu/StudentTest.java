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
    public void testHashCodeAndEquals() {
        Student students1 = new Student("Ivar",
                "Grimstad", 3.9, 2);
        Student students2 = new Student("Ivar",
                "Grimstad", 3.9, 2);
        Student students3 = new Student("Ivan",
                "Grimstad", 3.9, 2);
        Student students4 = new Student("Ivar",
                "Polo", 3.9, 2);
        Student students5 = new Student("Ivar",
                "Grimstad", 7.3, 2);
        Student students6 = new Student("Ivar",
                "Grimstad", 3.9, 1);

        assertEquals(students1.hashCode(), students2.hashCode());
        assertNotEquals(students2, students3);
        assertNotEquals(students2, students4);
        assertNotEquals(students2, students5);
        assertNotEquals(students2, students6);
        assertNotEquals(students2, null);
    }
}
