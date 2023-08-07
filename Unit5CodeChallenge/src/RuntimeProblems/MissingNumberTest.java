package RuntimeProblems;

import static org.junit.Assert.*;
import org.junit.Test;

public class MissingNumberTest {
private MissingNumber mn = new MissingNumber();

@Test
public void testMissingNumber_MissingMax() {
    int input = mn.findMissingNumber(new int[]{1,5,9,6,3,7,2,8,4}, 10);
    assertEquals(input,9);
}

@Test
public void testMissingNumber_MissingEight() {
    assertEquals( 8, mn.findMissingNumber(new int[]{1,8,5,9,6,3,7,2,10,4}, 10));
}

@Test
public void testMissingNumber_MissingNome() {
    assertEquals(-1, mn.findMissingNumber(new int[]{1,8,5,9,6,3,7,2,10,4}, 10));
}
}