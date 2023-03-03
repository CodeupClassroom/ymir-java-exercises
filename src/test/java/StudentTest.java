import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class StudentTest {
    private Student bob = null;

    @Before
    public void setup() {
        bob = new Student(1, "bob");
    }

    private void add3Grades(Student student) {
        student.addGrade(50);
        student.addGrade(60);
        student.addGrade(80);
    }

    @Test
    public void testCreateStudentIdOk() {
        assertEquals(1, bob.getId());
    }

    @Test
    public void testCreateStudentNameOk() {
        assertEquals("bob", bob.getName());
    }

    @Test
    public void testCreateStudentGradesOk() {
        assertEquals(0, bob.getGrades().size());
    }

    @Test
    public void testAddGrade() {
        add3Grades(bob);

        Integer [] grades1 = {50, 60, 80};
        assertArrayEquals(grades1, bob.getGrades().toArray(new Integer[grades1.length]));

        assertEquals(3, bob.getGrades().size());
        assertEquals(Integer.valueOf(50), bob.getGrades().get(0));
        assertEquals(Integer.valueOf(80), bob.getGrades().get(2));
    }

    @Test
    public void testAverage3Grades() {
        add3Grades(bob);

        assertEquals(63.33, bob.getGradeAverage(), .01);
    }

    @Test
    public void testAverageNoGrades() {
        assertEquals(Double.NaN, bob.getGradeAverage(), .01);
    }
}
