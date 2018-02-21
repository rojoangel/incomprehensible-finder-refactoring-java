package algorithm;

import org.junit.Test;

import static algorithm.SamplePerson.*;
import static org.junit.Assert.assertEquals;

public class FTTest {

    private Pair closestPair = new Pair(sue, greg);
    private Pair furthestPair = new Pair(sarah, sue);

    @Test
    public void closest_find_should_result_closest_birth_dates() {
        FT closest = FT.Closest;
        assertEquals(closestPair, closest.find(closestPair, furthestPair));
    }

    @Test
    public void furthest_find_should_result_furthest_birth_dates() {
        FT closest = FT.Furthest;
        assertEquals(furthestPair, closest.find(closestPair, furthestPair));
    }
}
