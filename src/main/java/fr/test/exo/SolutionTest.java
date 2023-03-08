package fr.test.exo;

import fr.test.Sequence;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void simpleTest() {
        assertArrayEquals(new int[]{5,4,3,2,1}, fr.test.Sequence.reverse(5));
    }

    @Test
    public void normalHappyFlow() {
        assertTrue("codewars can be created from code and wars", fr.test.Sequence.isMerge("codewars", "code", "wars"));
        assertTrue("codewars can be created from cdwr and oeas", fr.test.Sequence.isMerge("codewars", "cdwr", "oeas"));
        assertFalse("Codewars are not codwars", Sequence.isMerge("+0x1xa,#'$GAo)", "a,'$o", ")0x1x#GA+"));
    }
}
