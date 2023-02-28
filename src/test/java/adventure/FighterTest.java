package adventure;

import org.junit.Before;
import org.junit.Test;
import playtime.Fighter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FighterTest {
    private Fighter bob = null;
    private Fighter noName = null;

    @Before
    public void initTestData() {
        bob = new Fighter("bob");
        noName = new Fighter();
    }

    @Test
    public void testAlwaysTrue() {
        assertTrue(true);
    }

    @Test
    public void testFighterNameGetterMatchesConstructor() {
        assertEquals("bob", bob.getName());
    }

    @Test
    public void testFighterNoName() {
        assertEquals("Unknown fighter", noName.getName());

    }

    @Test
    public void testNoNameHitsBob() {
        noName.hit(bob);
        assertEquals(90, bob.getHealth());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFighterNameTooShort() {
        // test will pass if it throws an exception when making a fighter with a name that is too short
        Fighter foo = new Fighter("");
    }

    @Test
    public void testIfChangeIsCorrect() {
        double x = 0;
        x += .1;
        x += .1;
        x += .1;
        System.out.println(x);

        assertEquals(.3, x, .0000001);
    }
}
