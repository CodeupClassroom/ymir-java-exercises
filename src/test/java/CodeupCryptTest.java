import org.junit.Test;

import static org.junit.Assert.*;

public class CodeupCryptTest {
    // focus on testing hashPassword
    // takes a string that is a pw
    // returns a string that is the hashed pw
    // replace vowels w numbers

    @Test
    public void testHashPwEmpty() {
        assertEquals("", CodeupCrypt.hashPassword(""));
    }

    @Test
    public void testHashPwLetterA() {
        assertEquals("4bc", CodeupCrypt.hashPassword("abc"));
    }

    @Test
    public void testHashPwLetterE() {
        assertEquals("3bc", CodeupCrypt.hashPassword("ebc"));
    }

    @Test
    public void testHashPwLetterI() {
        assertEquals("1bc", CodeupCrypt.hashPassword("ibc"));
    }

    @Test
    public void testHashPwLetterO() {
        assertEquals("0bc", CodeupCrypt.hashPassword("obc"));
    }

    @Test
    public void testHashPwLetterU() {
        assertEquals("9bc", CodeupCrypt.hashPassword("ubc"));
    }

    @Test
    public void testHashPwNoVowels() {
        assertEquals("bcxyz", CodeupCrypt.hashPassword("bcxyz"));
    }

}
