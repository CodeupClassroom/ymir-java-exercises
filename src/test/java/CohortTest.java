import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CohortTest {
    private Cohort emptyCohort = null;
    private Cohort notEmptyCohort = null;

    private Student bob = null;
    private Student sue = null;
    private Student lou = null;

    @Before
    public void setup() {
        emptyCohort = new Cohort();
        notEmptyCohort = new Cohort();

        bob = new Student(1, "bob");
        bob.addGrade(50);
        bob.addGrade(60);
        bob.addGrade(80);
        notEmptyCohort.addStudent(bob);

        sue = new Student(2, "sue");
        sue.addGrade(80);
        sue.addGrade(90);
        sue.addGrade(100);
        notEmptyCohort.addStudent(sue);

        lou = new Student(3, "lou");
        lou.addGrade(57);
        lou.addGrade(83);
        lou.addGrade(95);
        notEmptyCohort.addStudent(lou);

    }

    @Test
    public void testAddStudentToEmpty() {
        Student jethro = new Student(4, "jethro");
        emptyCohort.addStudent(jethro);

        assertEquals(1, emptyCohort.getStudents().size());
        assertSame(jethro, emptyCohort.getStudents().get(0));
    }

    @Test
    public void testAddStudentToNotEmpty() {
        Student jethro = new Student(4, "jethro");
        notEmptyCohort.addStudent(jethro);

        assertEquals(4, notEmptyCohort.getStudents().size());
        assertSame(jethro, notEmptyCohort.getStudents().get(notEmptyCohort.getStudents().size() - 1));
    }

    @Test
    public void testGetStudentsFromEmpty() {
        assertEquals(0, emptyCohort.getStudents().size());
    }

    @Test
    public void testGetStudentsFromNotEmpty() {
        Student [] testStudents = {bob, sue, lou};
        assertArrayEquals(testStudents, notEmptyCohort.getStudents().toArray(new Student[0]));
    }

    @Test
    public void testCalcAverageFromNotEmpty() {
        assertEquals(77.22, notEmptyCohort.getCohortAverage(), .01);
    }

    @Test
    public void testCalcAverageFromEmpty() {
        assertEquals(Double.NaN, emptyCohort.getCohortAverage(), .01);
    }
}
