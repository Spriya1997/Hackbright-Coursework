package DataStructures;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.*;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.*;

@RunWith(Parameterized.class)
public class parameterizedTestBB {

    balancedBrackets bb = new balancedBrackets();
    private String input;
    private boolean expectedOutput;


    public parameterizedTestBB(String input, boolean expectedOutput){
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameters
    public static Collection<Object[]> testConditions() {
        String balancedParens = "()";
        String balancedAngleBrackets = "<<>>";
        String balancedComboBrackets = "<({})>";
        String emptyString = "";
        String tooManyOpenParens = "((";
        String tooManyOpenParens1 = "()(";
        String tooManyClosedParens = "())";
        String startClosedParens = ")(";
        String mismatchedBrackets = "<({)}>";

        Object[][] expectedOutputs = {
                { balancedParens, true },
                { balancedAngleBrackets, true },
                { balancedComboBrackets, true },
                { emptyString, true },
                { tooManyOpenParens, false },
                { tooManyOpenParens1, false },
                { tooManyClosedParens, false },
                { startClosedParens, false },
                { mismatchedBrackets, false }
        };

        return Arrays.asList(expectedOutputs);
    }

    @Test
    public void testBalancedBrackets(){
        assertEquals(expectedOutput, bb.isbalancedBrackets(input));
    }
}
