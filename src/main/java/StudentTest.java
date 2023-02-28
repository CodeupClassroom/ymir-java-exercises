import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    private Student bob = null;

    @Before
    public void setup() {
        bob = new Student(1, "bob");
    }

    @Test
    public void testCreateStudentIdOk() {
        Assert.assertEquals(1, bob.getId());
    }

    @Test
    public void testCreateStudentNameOk() {
        Assert.assertEquals("bob", bob.getName());
    }

    @Test
    public void testCreateStudentGradesOk() {
        Assert.assertEquals(0, bob.getGrades().size());
    }

    @Test
    public void testAddGrade() {
        bob.addGrade(50);
        bob.addGrade(60);
        bob.addGrade(80);

        Assert.assertEquals(3, bob.getGrades().size());
        Assert.assertEquals(Integer.valueOf(50), bob.getGrades().get(0));
        Assert.assertEquals(Integer.valueOf(80), bob.getGrades().get(2));
    }

//    @Test
//    public void test
}
