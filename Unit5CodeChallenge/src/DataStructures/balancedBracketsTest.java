package DataStructures;

import static org.junit.Assert.*;
import org.junit.Test;

public class balancedBracketsTest {

    balancedBrackets bb = new balancedBrackets();

    @Test
    public void testBalancedBrackets_startWithClosedParens() {
        assertFalse(bb.isbalancedBrackets(")("));
    }

    @Test
    public void testBalancedBrackets_emptyString() {
        assertTrue(bb.isbalancedBrackets(""));
    }

    @Test
    public void testBalancedBrackets_balancedComboBrackets() {
        assertTrue(bb.isbalancedBrackets("({})[{()}]"));
    }

    @Test
    public void testBalancedBrackets_mismatchedBrackets() {
        assertFalse(bb.isbalancedBrackets("<({)}>"));
    }

}