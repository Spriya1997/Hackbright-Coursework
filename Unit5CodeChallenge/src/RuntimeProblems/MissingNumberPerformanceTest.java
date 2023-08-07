package RuntimeProblems;

import org.junit.Test;

public class MissingNumberPerformanceTest {
    private int[] missingMax = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    private int[] missingNone = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    private int[] missingSeven = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
    private int max = 10;
    private MissingNumber mn = new MissingNumber();

    @Test(timeout = 100)
    public void testMissingNumberSet_Performance() {
        for (int i = 0; i < 1000000; i ++) {
            mn.missingNumberSet(missingMax, max);
            mn.missingNumberSet(missingNone, max);
            mn.missingNumberSet(missingSeven, max);
        }
    }

    @Test(timeout = 100)
    public void testMissingNumberSort_Performance() {
        for (int i = 0; i < 1000000; i ++) {
            mn.missingNumberSort(missingMax, max);
            mn.missingNumberSort(missingNone, max);
            mn.missingNumberSort(missingSeven, max);
        }
    }

    @Test(timeout = 100)
    public void testMissingNumberSum_Performance() {
        for (int i = 0; i < 1000000; i += 1) {
            mn.findMissingNumber(missingMax, max);
            mn.findMissingNumber(missingNone, max);
            mn.findMissingNumber(missingSeven, max);
        }
    }
}
