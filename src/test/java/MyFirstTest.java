import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyFirstTest {

    @Test
    public void testCodeupString() {
        String codeup = "Codeup";
        assertEquals("Codeup", codeup);
    }

    @Test
    public void testEmptyStringArrayLists() {
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages, moreLanguages);
    }

    @Test
    public void testNumberArraysAreEqual() {
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void testPHPNameContainsSomeLetters() {
        String language = "PHP";
        assertTrue(language.contains("H")); // use assertTrue for this statement
        assertFalse(language.contains("J")); // use assertFalse for this statement

    }

    @Test
    public void testLanguageStringJavaNull() {
        String language = null;
        // assertNull on the language variable
        assertNull(language);

        language = "Java";
        // assertNotNull on the language variable
        assertNotNull(language);
    }
}
